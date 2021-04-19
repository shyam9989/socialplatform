package com.social.platform.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.social.platform.dao.RatingRepository;
import com.social.platform.dao.UserRepository;
import com.social.platform.dao.pictureRepository;
import com.social.platform.model.PicturesModel;
import com.social.platform.model.RatingModel;
import com.social.platform.model.UserModel;
import com.social.platform.service.ArtistService;
import com.social.platform.service.UserService;

@Controller
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
	
	@GetMapping("/viewPictures")
	public String viewPictures(Model model) {
		
		List<PicturesModel> pic=userService.getPictures();
		model.addAttribute("pictures",pic);
		
		return "viewPictures";
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
	public String review(@RequestParam("picid") String picid,@RequestParam("userid") String userid,Model model) {
		System.out.println("in review button");
		PicturesModel pm=pictureRepository.getOne(Integer.parseInt(picid));
		UserModel um= userRepository.getOne(Integer.parseInt(userid));
		/*
		 * RatingModel rm=new RatingModel(); rm.setDislikes("1");
		 * rm.setPicturesModel(pm); rm.setUsermodel(um); ratingRepository.save(rm);
		 */
		model.addAttribute("pic",pm);
		model.addAttribute("usermodel",um);
		return "addRatings";
		
	}
	
	@PostMapping("/review1")
	public String review1(@RequestParam("picid") String picid,@RequestParam("userid") String userid,Model model,
			@RequestParam("stars") String stars
			) {
		System.out.println("in review button"+stars);
		PicturesModel pm=pictureRepository.getOne(Integer.parseInt(picid));
		UserModel um= userRepository.getOne(Integer.parseInt(userid));
		RatingModel rm=new RatingModel();
		rm.setRating(stars);
		rm.setPicturesModel(pm);
		rm.setUsermodel(um);
		ratingRepository.save(rm);
		return "viewPictures";
		
	}
	
	
	@GetMapping("viewArtists")
	public String viewArtists(@RequestParam("artist") String artist) {
		
		/*
		 * System.out.println(artist); List<UserModel>
		 * um2=userRepository.getBySkillset("painter"); for(UserModel um3:um2) {
		 * System.out.println(um3.getEmailid()); }
		 */
		
		
		List<UserModel> um=artistService.userRoleService(artist);
		
		List<UserModel> um4=um.stream().filter(um1-> um1.getSkillset()!=null).collect(Collectors.toList());
		
		um4.stream().forEach(um5 -> System.out.println(um5.getEmailid()));
		
		return "view";
	}
	
	
	

}
