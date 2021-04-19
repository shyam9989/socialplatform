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

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSkillset() {
		return skillset;
	}

	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}

	public String getMyDescription() {
		return myDescription;
	}

	public void setMyDescription(String myDescription) {
		this.myDescription = myDescription;
	}

	public List<PicturesModel> getPicturesModel() {
		return picturesModel;
	}

	public void setPicturesModel(List<PicturesModel> picturesModel) {
		this.picturesModel = picturesModel;
	}

	public List<RatingModel> getRatingModel() {
		return ratingModel;
	}

	public void setRatingModel(List<RatingModel> ratingModel) {
		this.ratingModel = ratingModel;
	}
	
	
	
	

	
}
