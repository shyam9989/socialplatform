package com.social.platform.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PicturesModel {
	
	@Id
	@GeneratedValue
	int picid;
	String picturepath;
	String pictureName;
	
	
	@ManyToOne
	@JoinColumn(name="userid")
	public UserModel usermodel;
	
	@OneToMany
	public List<RatingModel> ratignModel;
	
	
	
	
	
	
}
