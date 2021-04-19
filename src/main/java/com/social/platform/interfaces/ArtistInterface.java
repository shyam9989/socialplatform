package com.social.platform.interfaces;

import java.util.List;

import com.social.platform.model.UserModel;

public interface ArtistInterface {
	
	public List<UserModel> getArtist(String role);

}
