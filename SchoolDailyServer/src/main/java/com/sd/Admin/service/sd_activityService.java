package com.sd.Admin.service;

import java.util.List;

import com.sd.Admin.pojo.sd_activity;

public interface sd_activityService {
	List<sd_activity> getActivitys();
	//获取待处理事件，以及活动
	List<sd_activity> getActivityList();
}
