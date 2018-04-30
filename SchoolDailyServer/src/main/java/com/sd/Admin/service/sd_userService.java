package com.sd.Admin.service;

import java.util.List;

import com.sd.Admin.pojo.sd_user;

public interface sd_userService {

	sd_user getUser(String userId,String userPassword);

	List<sd_user> getUsers();
	//修改
	void updateUser(sd_user mUser);
}
