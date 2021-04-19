package com.social.platform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.platform.dao.pictureRepository;
import com.social.platform.model.PicturesModel;

@Service
public class UserService {
	
	@Autowired
    pictureRepository pictureRepository;
	
	public List<PicturesModel> getPictures() {
		
		List<PicturesModel> picmodel= pictureRepository.findAll();
		
		return picmodel;
		}
	
	
	

}
