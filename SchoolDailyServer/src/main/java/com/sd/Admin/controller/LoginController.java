package com.sd.Admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sd.Admin.pojo.sd_user;
import com.sd.Admin.service.sd_userService;

@Controller
@RequestMapping(value="/admin")
public class LoginController {
	@Autowired
	sd_userService mUserService;
	
@RequestMapping("test")
public void test() {
	System.out.println("test");
}

//web登录
@RequestMapping("login")
public String Login() {
	return "pages_sign-in";
}

//web检查登录
@RequestMapping("checklogin")
public String checkLogin(HttpServletRequest request,HttpSession session) {
	String userId=request.getParameter("userId");
	String userPassword=request.getParameter("userPassword");
	sd_user mUser=mUserService.getUser(userId, userPassword);
	if (mUser!=null) {
		session.setAttribute("user",mUser);
		return "pages_user";
	}
	return "pages_sign-in";
}

}
