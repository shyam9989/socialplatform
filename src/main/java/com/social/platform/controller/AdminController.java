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
import com.social.platform.model.PicturesModel;
import com.social.platform.model.RatingModel;
import com.social.platform.model.UserModel;

@Controller
public class AdminController {
	
	@Autowired
	RatingRepository ratingRepository;
	
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

}
