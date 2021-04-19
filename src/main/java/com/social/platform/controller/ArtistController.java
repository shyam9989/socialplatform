package com.social.platform.controller;

import java.io.IOException;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.social.platform.dao.UserRepository;
import com.social.platform.dao.pictureRepository;
import com.social.platform.model.PicturesModel;
import com.social.platform.model.UserModel;
import com.social.platform.service.ArtistService;
import com.social.platform.utils.FileUploadUtil;

@Controller
@SessionAttributes("usermodel")
public class ArtistController {

	@Autowired
	UserRepository userRepository;

	@Autowired
	pictureRepository pictureRepository;

	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private ArtistService UserService;

	@RequestMapping("/registerform")
	public String test() {
		return "register";
	}

	@PostMapping("/registersubmit")
	public String register(@RequestParam("username") String username, @RequestParam("emailid") String mailid,
			@RequestParam("password") String password, @RequestParam("role") String role, Model model) {

		UserModel um = new UserModel();

		um.setName(username);
		um.setEmailid(mailid);
		um.setPassword(password);
		um.setRole(role);

		um = userRepository.save(um);
		if (um == null) {
			model.addAttribute("message", "something went wrong");
		} else {
			model.addAttribute("message", "success");
		}

		return "register";

	}

	@GetMapping("/loginform")
	public String loginform() {

		return "login";
	}

	@PostMapping("/login")
	public String login(@RequestParam("username") String uname, @RequestParam("password") String password, Model model,
			@RequestParam("role") String role) {

		UserModel um = userRepository.getByNameAndPassword(uname, password);
		
	//	System.out.println(um.getRole()+"from db");
	//	System.out.println(um.getRole()+"from form");

		if (um == null) {
			model.addAttribute("message", "error in login");
			return "login";
		} else {

			if (um.getRole().equalsIgnoreCase("artist")) {
				model.addAttribute("usermodel", um);
				return "loginsuccess";

			} else if (um.getRole().equalsIgnoreCase("user")) {
				model.addAttribute("usermodel", um);
				return "loginUsersuccess";

			} else if (um.getRole().equalsIgnoreCase(role)) {
				return "loginsuccessadmin";
			}

			else {
				model.addAttribute("message", "you selected role is wrong");
				return "login";
			}

		}

	}

	@GetMapping("/addpaintform")
	public String addPaintingForm() {

		return "addpaintform";

	}

	@PostMapping("/addPaint")
	public String addPainting(@RequestParam("image") MultipartFile multipartFile,
			@RequestParam("imagename") String imagename, @RequestParam("userid") String userId) {

		String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
		PicturesModel pm = new PicturesModel();
		System.out.println("username is" + userId);
		UserModel um = userRepository.getOne(Integer.parseInt(userId));

		String uploadDir = "/Users/pillishyam/Downloads/platform/images/";
		pm.setPicturepath(uploadDir);
		pm.setUsermodel(um);
		pm.setPictureName(fileName);

		try {
			FileUploadUtil.saveFile(uploadDir, fileName, multipartFile, pm);
			pictureRepository.save(pm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "loginsuccess";

	}

	@GetMapping("/viewPaint/{userid}")
	public String viewPainting(@PathVariable String userid, Model model) {

		UserModel um = userRepository.getOne(Integer.parseInt(userid));

		List<PicturesModel> picmodel = um.getPicturesModel();
		for (PicturesModel pm : picmodel) {
			System.out.println(pm.getPictureName());
			System.out.println(pm.getPicturepath());

		}
		model.addAttribute("pictures", picmodel);

		return "viewPaintings";

	}
	
	@GetMapping("/addSkillsetForm")
	public String addSkillset(Model model) {
		return "addSkillsetForm";
	}
	
	@PostMapping("/addSkill")
	public String addSkillSet(@RequestParam("userid") String userid,@RequestParam("skill") String skill) {
		
		UserModel um = userRepository.getOne(Integer.parseInt(userid));
		um.setSkillset(skill);
	userRepository.save(um);
		return "addSkillsetFrom";
	}
	
	
	@GetMapping("/addDescForm")
	public String addDescForm(Model model) {
		return "description";
	}
	
	@PostMapping("/addDesc")
	public String addDesc(@RequestParam("userid") String userid,@RequestParam("desc") String desc) {
		
		UserModel um = userRepository.getOne(Integer.parseInt(userid));
		um.setMyDescription(desc);
	userRepository.save(um);
		return "description";
	}
	
	@GetMapping("/viewProifle/{userid}")
	public String viewProfile(@PathVariable String userid, Model model) {

		UserModel um=UserService.userProfileService(userid);
		System.out.println(um.getEmailid());
		model.addAttribute("usermodel",um);
		return "Profile";
	}
	

}
