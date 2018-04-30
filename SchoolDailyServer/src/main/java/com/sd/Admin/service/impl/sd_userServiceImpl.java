package com.sd.Admin.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.Admin.mapper.sd_userMapper;
import com.sd.Admin.pojo.sd_user;
import com.sd.Admin.service.sd_userService;

@Service
public class sd_userServiceImpl  implements sd_userService{

	@Autowired
	sd_userMapper mUserMapper;
	@Override
	//获得用户
	public sd_user getUser(String userId, String userPassword) {
		sd_user mUser=new sd_user();
		 mUser=mUserMapper.selectByPrimaryKey(userId);
		try {
			if (mUser.getUserPassword().equals(userPassword)) {
				return mUser;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return mUser;
		
	}
	
	//获得所有用户
	@Override
	public List<sd_user> getUsers() {
		return mUserMapper.getUsers();
	}

	public void updateUser(sd_user mUser) {
			mUserMapper.updateByPrimaryKey(mUser);
	}

}
