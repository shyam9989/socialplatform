package com.social.platform.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.social.platform.dao.RatingRepository;
import com.social.platform.dao.pictureRepository;
import com.social.platform.model.PicturesModel;
import com.social.platform.model.RatingModel;
import com.social.platform.model.UserModel;

@Controller
public class AdminController {
	
	@Autowired
	RatingRepository ratingRepository;
	@Autowired
	pictureRepository pictureRepository;
	
	@GetMapping("/viewRatings")
	public String viewRatings(@RequestParam("artist") String artist,Model model) {
		
		List<RatingModel> ratings=ratingRepository.findAll();
		
		
		
		List<PicturesModel> finalpics=new ArrayList<PicturesModel>();
		
		for(RatingModel rm:ratings) {
			PicturesModel pm=rm.getPicturesModel();
			UserModel um=pm.getUsermodel();
			if(um.getSkillset().equalsIgnoreCase(artist)) {
				finalpics.add(pm);
			}
			
		}
		
		List<PicturesModel> deduped = finalpics.stream().distinct().collect(Collectors.toList());
	
		model.addAttribute("pictures",deduped);
		
		
		
		return "viewRatings";
		
	}
	
	@GetMapping("viewAdminReview")
	public String viewAdminReview(@RequestParam("picid") String picid,Model model) {
		
		List<RatingModel> ratings=ratingRepository.findAll();
		List<RatingModel> rate=new ArrayList<RatingModel>();
		int likes=0;
		int dislikes=0;
		
		for(RatingModel r2:ratings) {
			
			PicturesModel pm=r2.getPicturesModel();
			if(pm.getPicid()==Integer.parseInt(picid)) {
				rate.add(r2);
				if(r2.getLikes()!=null) {
					likes=likes+1;
				}
				if(r2.getDislikes()!=null) {
					dislikes=dislikes+1;
				}
				
			}
			
		}
		model.addAttribute("like",likes);
		model.addAttribute("dislikes",dislikes);
		System.out.println("hiiii"+picid);
		PicturesModel pm= pictureRepository.getOne(Integer.parseInt(picid));
		System.out.println(pm.getPicid());
		List<RatingModel> rm=pm.getRatignModel();
		if(rm==null) {
			System.out.println("rm is null");
		}else {
			System.out.println("rm is not null");
		}
		
		model.addAttribute("rating",rate);
		for(RatingModel r:rm) {
			System.out.println(r.getReview());
			System.out.println(r.getLikes());
			
		}
		return "viewAdminReview";
		
	}

}
