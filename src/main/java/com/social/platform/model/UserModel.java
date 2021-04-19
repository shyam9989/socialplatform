package com.social.platform.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserModel {
	
	@Id
	@GeneratedValue
	int userid;
	String name;
	String emailid;
	String password;
	String role;
	String skillset;
	String myDescription;
	
	@OneToMany(mappedBy = "usermodel")
	public List<PicturesModel> picturesModel;
	
	@OneToMany(mappedBy = "usermodel")
	public List<RatingModel> ratingModel;
	
	

	
}
