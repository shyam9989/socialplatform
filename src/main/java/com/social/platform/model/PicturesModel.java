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

	public int getPicid() {
		return picid;
	}

	public void setPicid(int picid) {
		this.picid = picid;
	}

	public String getPicturepath() {
		return picturepath;
	}

	public void setPicturepath(String picturepath) {
		this.picturepath = picturepath;
	}

	public String getPictureName() {
		return pictureName;
	}

	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}

	public UserModel getUsermodel() {
		return usermodel;
	}

	public void setUsermodel(UserModel usermodel) {
		this.usermodel = usermodel;
	}

	public List<RatingModel> getRatignModel() {
		return ratignModel;
	}

	public void setRatignModel(List<RatingModel> ratignModel) {
		this.ratignModel = ratignModel;
	}
	
	
	
	
	
	
}
