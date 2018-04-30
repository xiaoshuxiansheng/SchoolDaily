package com.sd.Admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.Admin.mapper.sd_activityMapper;
import com.sd.Admin.pojo.sd_activity;
import com.sd.Admin.service.sd_activityService;
@Service
public class sd_activityServiceImpl implements sd_activityService {

@Autowired
sd_activityMapper mActivityMapper;
	@Override
	public List<sd_activity> getActivitys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<sd_activity> getActivityList() {
		// TODO Auto-generated method stub
		return mActivityMapper.getActivityList();
	}

}
