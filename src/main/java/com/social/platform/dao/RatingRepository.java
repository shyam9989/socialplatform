package com.social.platform.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.platform.model.RatingModel;

public interface RatingRepository extends JpaRepository<RatingModel, Integer> {

}
