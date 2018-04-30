package com.sd.Admin.service;

import java.util.List;

import com.sd.Admin.pojo.sd_check;

public interface sd_checkService {
	sd_check getCheck(String todayTime);
	List<sd_check> getCheckList();
}
