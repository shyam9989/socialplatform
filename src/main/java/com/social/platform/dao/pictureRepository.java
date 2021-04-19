package com.social.platform.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.platform.model.PicturesModel;

public interface pictureRepository extends JpaRepository<PicturesModel, Integer> {

}
