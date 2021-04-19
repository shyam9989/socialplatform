package com.social.platform.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RatingModel {

	@Id
	@GeneratedValue
	private int ratingid;
	private String likes;
	private String dislikes;
	private String rating;
	private String review;
	
	@ManyToOne
	@JoinColumn(name="picid")
	private PicturesModel picturesModel;
	
	@ManyToOne
	@JoinColumn(name="userid")
	public UserModel usermodel;

	public int getRatingid() {
		return ratingid;
	}

	public void setRatingid(int ratingid) {
		this.ratingid = ratingid;
	}

	public String getLikes() {
		return likes;
	}

	public void setLikes(String likes) {
		this.likes = likes;
	}

	public String getDislikes() {
		return dislikes;
	}

	public void setDislikes(String dislikes) {
		this.dislikes = dislikes;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public PicturesModel getPicturesModel() {
		return picturesModel;
	}

	public void setPicturesModel(PicturesModel picturesModel) {
		this.picturesModel = picturesModel;
	}

	public UserModel getUsermodel() {
		return usermodel;
	}

	public void setUsermodel(UserModel usermodel) {
		this.usermodel = usermodel;
	}

	
	
	
}
