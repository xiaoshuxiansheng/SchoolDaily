package com.sd.Admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sd.Admin.pojo.sd_activity;
import com.sd.Admin.service.sd_activityService;

@Controller
@RequestMapping("admin")
public class ActivityController {
	@Autowired
	sd_activityService mActivityService;
	@RequestMapping("activity")
	public String table() {
		return "pages_activity";
	}

	//学生
	@RequestMapping("getactivitys")
	public @ResponseBody List<sd_activity> getstudents() {
		return mActivityService.getActivityList();
	}
}
