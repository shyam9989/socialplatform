package com.social.platform.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.platform.dao.UserRepository;
import com.social.platform.interfaces.ArtistInterface;
import com.social.platform.interfaces.UserProfileInterface;
import com.social.platform.model.UserModel;

@Service
public class ArtistService {

	@Autowired
	UserRepository userRepository;

	public UserModel userProfileService(String userid) {

		UserProfileInterface upf = userid1 -> {

			UserModel um = userRepository.getOne(userid1);

			return um;
		};

		return upf.getProfile(Integer.parseInt(userid));

	}
	
	public List<UserModel> userRoleService(String role) {

		ArtistInterface upf = role1 -> {

			List<UserModel> um = userRepository.getBySkillset(role1);

			return um;
		};

		return upf.getArtist(role);

	}
	
	
	
	
	

}
