package com.social.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.social.platform.dao.UserRepository;
import com.social.platform.model.UserModel;


@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/registerform")
	public String test() {
		return "register";
	}
	
	@PostMapping("/registersubmit")
	public String register(@RequestParam("username") String username,
			@RequestParam("emailid") String mailid,
			@RequestParam("password") String password,
			@RequestParam("role") String role,
			Model model
			) {
		
		UserModel um=new UserModel();
		um.setName(username);
		um.setEmailid(mailid);
		um.setPassword(password);
		um.setRole(role);
		
		 um=userRepository.save(um);
		 if(um==null) {
			 model.addAttribute("message", "something went wrong");
		 }else {
			 model.addAttribute("message","success");
		 }
		
		return "register";
		
	}

}
