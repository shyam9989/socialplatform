package com.social.platform.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.social.platform.dao.RatingRepository;
import com.social.platform.dao.UserRepository;
import com.social.platform.dao.pictureRepository;
import com.social.platform.model.PicturesModel;
import com.social.platform.model.RatingModel;
import com.social.platform.model.UserModel;
import com.social.platform.service.ArtistService;
import com.social.platform.service.UserService;

@Controller
@SessionAttributes("usermodel")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	pictureRepository pictureRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RatingRepository ratingRepository;
	
	@Autowired
	ArtistService artistService;
	
	
	
	
	@GetMapping("/home")
	public String homepage() {
		return "loginUsersuccess";
	}
	
	@GetMapping("/home1")
	public String homepage1(@RequestParam ("userid") String userid,Model model) {
		UserModel um=userRepository.getOne(Integer.parseInt(userid));
		model.addAttribute("usermodel", um);
		return "loginsuccess";
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		
		HttpSession session= request.getSession(false);
       
        if(session != null) {
            session.invalidate();
        }
		return "login";
	}
	
	@GetMapping("/viewPictures")
	public String viewPictures(Model model,@RequestParam("artist") String artist,
			@RequestParam("user") String user
			
			) {
		
		List<PicturesModel> pic=userService.getPictures();
		
		List<PicturesModel> pic2=new ArrayList<PicturesModel>();
		for(PicturesModel pic1:pic) {
			UserModel um=pic1.getUsermodel();
			if(um.getSkillset().equalsIgnoreCase(artist)) {
				pic2.add(pic1);
			}
		}
		
		model.addAttribute("pictures",pic2);
		if(user.equalsIgnoreCase("user")) {
			return "viewPictures";
		}else {
			return "viewAdminPictures";
		}
		
		
	}
	
	
	@GetMapping("/like")
	public String like(@RequestParam("picid") String picid,@RequestParam("userid") String userid) {
		System.out.println("in like button");
		PicturesModel pm=pictureRepository.getOne(Integer.parseInt(picid));
		UserModel um= userRepository.getOne(Integer.parseInt(userid));
		RatingModel rm=new RatingModel();
		rm.setLikes("1");
		rm.setPicturesModel(pm);
		rm.setUsermodel(um);
		ratingRepository.save(rm);
		return "viewPictures";
		
	}
	
	@GetMapping("/dislike")
	public String Dislike(@RequestParam("picid") String picid,@RequestParam("userid") String userid) {
		System.out.println("in dislike button");
		PicturesModel pm=pictureRepository.getOne(Integer.parseInt(picid));
		UserModel um= userRepository.getOne(Integer.parseInt(userid));
		RatingModel rm=new RatingModel();
		rm.setDislikes("1");
		rm.setPicturesModel(pm);
		rm.setUsermodel(um);
		ratingRepository.save(rm);
		return "viewPictures";
		
	}
	
	@GetMapping("/review")
	public String review(@RequestParam("picid") String picid,
			@RequestParam("userid") String userid,
			Model model
			
			) {
		System.out.println("in review button");
		PicturesModel pm=pictureRepository.getOne(Integer.parseInt(picid));
		UserModel um= userRepository.getOne(Integer.parseInt(userid));
		/*
		 * RatingModel rm=new RatingModel(); rm.setDislikes("1");
		 * rm.setPicturesModel(pm); rm.setUsermodel(um); ratingRepository.save(rm);
		 */
		/*RatingModel rm=new RatingModel();
		rm.setReview(review);
		rm.setPicturesModel(pm);
		rm.setUsermodel(um);
		ratingRepository.save(rm);*/
		model.addAttribute("pic",pm);
		model.addAttribute("usermodel",um);
		return "addRatings";
		
	}
	
	
	@PostMapping("/review1")
	public String review1(@RequestParam("picid") String picid,@RequestParam("userid") String userid,Model model,
			@RequestParam("stars") String stars,@RequestParam("review") String review
			) {
		System.out.println("in review button"+stars);
		PicturesModel pm=pictureRepository.getOne(Integer.parseInt(picid));
		UserModel um= userRepository.getOne(Integer.parseInt(userid));
		RatingModel rm=new RatingModel();
		rm.setRating(stars);
		rm.setReview(review);
		rm.setPicturesModel(pm);
		rm.setUsermodel(um);
		ratingRepository.save(rm);
		return "viewPictures";
		
	}
	
	
	@GetMapping("viewArtists")
	public String viewArtists(@RequestParam("artist") String artist,
			Model model,
			@RequestParam("user") String user
			) {
		
		List<UserModel> um=artistService.userRoleService(artist);
		
		List<UserModel> um4=um.stream().filter(um1-> um1.getSkillset()!=null).collect(Collectors.toList());
		
		um4.stream().forEach(um5 -> System.out.println(um5.getEmailid()));
		model.addAttribute("art",um4);
		model.addAttribute("user","userall");
		if(user.equalsIgnoreCase("user")) {
		return "ViewArtisians";
		}else {
			return "viewAdminArtisians";
		}
	}
	

	@GetMapping("viewArtist")
	public String viewArtist(@RequestParam("artname") String artist,
			Model model,
			@RequestParam("user") String user
			) {
		
		UserModel um=userRepository.findByName(artist);
		
		
		model.addAttribute("art",um);
		model.addAttribute("user","userone");
		
		if(user.equalsIgnoreCase("user")) {
			return "ViewArtisians";
			}else {
				return "viewAdminArtisians";
			}
	}
	
	
	

}
