package com.sd.Admin.controller;


import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sd.Admin.pojo.sd_activity;
import com.sd.Admin.pojo.sd_check;
import com.sd.Admin.pojo.sd_student;
import com.sd.Admin.pojo.sd_user;
import com.sd.Admin.service.sd_activityService;
import com.sd.Admin.service.sd_checkService;
import com.sd.Admin.service.sd_studentService;
import com.sd.Admin.service.sd_userService;

@Controller
@RequestMapping(value="/ad")
public class AndroidController {
	@Autowired
	sd_userService mUserService;
	@Autowired
	sd_checkService mCheckService;
	@Autowired
	sd_studentService mStudentService;
	@Autowired
	sd_activityService mActivityService;
	
	//Android登录
	@RequestMapping("login")
	public @ResponseBody sd_user adlogin( HttpServletRequest request) {
		String param=request.getParameter("UserInfo");
		JSONObject json=JSONObject.fromObject(param);
		String userId=json.getString("user_id");
		String userPassword=json.getString("user_password");
		sd_user mUser=mUserService.getUser(userId, userPassword);
		return mUser;
	}
	//今日 考勤
	@RequestMapping("AndroidMorCheckInfo")
	public @ResponseBody List<sd_check> AndroidMorCheckInfo(HttpServletRequest request) {
		String todayTime=request.getParameter("Str");
		List<sd_check> mCheckList=new ArrayList<>();
		mCheckList=mCheckService.getCheckList();
		return mCheckList;
	}
	
	//学生信息
		@RequestMapping("AndroidClassStudentInfo")
		public @ResponseBody List<sd_student> AndroidClassStudentInfo(HttpServletRequest request) throws UnsupportedEncodingException {
			String todayTime=request.getParameter("Str");
			String value=new String(todayTime.getBytes("ISO8859-1"),"UTF-8");
			JSONObject json=new JSONObject().fromObject(value);
			String mGrade=json.getString("mGrade");
			String mMajor=json.getString("mMajor");
			String mClass=json.getString("mClass");
			if (mMajor.equals("计科")) {
				mMajor="计算机科学与技术";
			}
			else mMajor="电工电信";
			List<sd_student> mUserlist=new ArrayList<>();
			mUserlist=mStudentService.getStudents(mClass, mMajor, mGrade);
			return mUserlist;
		}
		
	//待处理事件
		//活动以及待处理事件
		@RequestMapping("ActivityShow")
		public @ResponseBody List<sd_activity> ActivityShow(HttpServletRequest request) {
			String todayTime=request.getParameter("Str");
			List<sd_activity> mActivityList=new ArrayList<>();
			mActivityList=mActivityService.getActivityList();
			return mActivityList;
		}
		
		//查寝
				@RequestMapping("DormitoryCheck")
				public @ResponseBody List<sd_student> DormitoryCheck(HttpServletRequest request) throws UnsupportedEncodingException {
					String todayTime=request.getParameter("UserStr");
					String value=new String(todayTime.getBytes("ISO8859-1"),"UTF-8");
					JSONObject json=new JSONObject().fromObject(value);
					String mGrade=json.getString("mGrade");
					String mMajor=json.getString("mMajor");
					String mClass=json.getString("mClass");
					if (mMajor.equals("计科")) {
						mMajor="计算机科学与技术";
					}
					else mMajor="电工电信";
					List<sd_student> mUserlist=new ArrayList<>();
					mUserlist=mStudentService.getStudents(mClass, mMajor, mGrade);
					return mUserlist;
				}
		//点名
				@RequestMapping("AndroidStuInfo")
				public @ResponseBody List<sd_student> AndroidStuInfo(HttpServletRequest request) throws UnsupportedEncodingException {
					String todayTime=request.getParameter("UserStr");
					String value=new String(todayTime.getBytes("ISO8859-1"),"UTF-8");
					JSONObject json=new JSONObject().fromObject(value);
					String mGrade=json.getString("mGrade");
					String mMajor=json.getString("mMajor");
					String mClass=json.getString("mClass");
					if (mMajor.equals("计科")) mMajor="计算机科学与技术";
					else mMajor="电工电信";
					if (mGrade.equals("15级"))mGrade="2015级";
					else mGrade="2016级";
					List<sd_student> mUserlist=new ArrayList<>();
					mUserlist=mStudentService.getStudents(mClass, mMajor, mGrade);
					return mUserlist;
				}
				
		//展示活动AndroidGetActInfo
				@RequestMapping("AndroidGetActInfo")
				public @ResponseBody List<sd_activity> AndroidGetActInfo(HttpServletRequest request) {
					String todayTime=request.getParameter("Str");
					List<sd_activity> mActivityList=new ArrayList<>();
					mActivityList=mActivityService.getActivityList();
					return mActivityList;
				}
			
}
