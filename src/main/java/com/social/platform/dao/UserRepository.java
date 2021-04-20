package com.social.platform.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.platform.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {

	UserModel getByNameAndPassword(String uname, String password);

	List<UserModel> getBySkillset(String role1);

	UserModel findByName(String artist);

	

}
