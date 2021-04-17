package com.social.platform.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.platform.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {

}
