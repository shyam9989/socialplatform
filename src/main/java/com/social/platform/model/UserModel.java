package com.social.platform.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserModel {
	
	@Id
	@GeneratedValue
	int id;
	String name;
	String emailid;
	String password;
	String role;

	
}
