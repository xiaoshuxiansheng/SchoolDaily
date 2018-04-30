package com.sd.Admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.Admin.mapper.sd_checkMapper;
import com.sd.Admin.pojo.sd_check;
import com.sd.Admin.service.sd_checkService;
@Service
public class sd_checkServiceImpl implements sd_checkService{
@Autowired
sd_checkMapper mCheckMapper;
	@Override
	public sd_check getCheck(String todayTime) {
		sd_check mCheck=mCheckMapper.selectByPrimaryKey(todayTime);
		return mCheck;
	}
	@Override
	public List<sd_check> getCheckList() {
		return mCheckMapper.getCheckList();
	}

}
