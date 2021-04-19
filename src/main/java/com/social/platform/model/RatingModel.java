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

}
