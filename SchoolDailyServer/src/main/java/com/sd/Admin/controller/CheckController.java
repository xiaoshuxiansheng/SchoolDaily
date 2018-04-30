package com.sd.Admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sd.Admin.pojo.sd_check;
import com.sd.Admin.pojo.sd_student;
import com.sd.Admin.service.sd_checkService;
import com.sd.Admin.service.sd_studentService;

@Controller
@RequestMapping("admin")
public class CheckController {
	@Autowired
	sd_checkService mCheckService;
	@RequestMapping("check")
	public String table() {
		return "pages_check";
	}

	//考勤
	@RequestMapping("getchecks")
	public @ResponseBody List<sd_check> getchecks() {
		return mCheckService.getCheckList();
	}
}
