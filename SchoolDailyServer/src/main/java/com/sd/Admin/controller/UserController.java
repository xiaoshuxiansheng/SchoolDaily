package com.sd.Admin.controller;
import java.io.UnsupportedEncodingException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sd.Admin.pojo.sd_user;
import com.sd.Admin.service.sd_userService;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("admin")
public class UserController {
	@Autowired
	sd_userService mUserService;
	@RequestMapping("user")
	public String table() {
		return "pages_user";
	}
	//用户
	@RequestMapping("getusers")
	public @ResponseBody List<sd_user> getusers() {
		return mUserService.getUsers();
	}
	
	//修改  {"userid":"admin","password":"admin","nickname":"张老师","pictrue":"http://atth.jzb.com/forum/201601/15/100844l55jr2d5b8wnc5ee.jpg",
	//"permission":"1","issign":"1","signtime":"2017-4-13","submit":"提交 "}
	@RequestMapping(value="update",produces="application/json;charset=UTF-8")
	public @ResponseBody sd_user update(HttpServletRequest request,@RequestBody String str) throws UnsupportedEncodingException {//@RequestBody JSONObject json
		System.err.println(str);
		JSONObject json=JSONObject.fromObject(str);
		sd_user mUser=new sd_user();
		mUser.setUserId(json.getString("userid"));
		mUser.setUserIssign(json.getInt("issign"));
		mUser.setUserNickname(json.getString("nickname"));
		mUser.setUserPassword(json.getString("password"));
		mUser.setUserPermission(json.getInt("permission"));
		mUser.setUserPictrue(json.getString("pictrue"));
		mUser.setUserSigntime(json.getString("signtime"));
		mUserService.updateUser(mUser);
		return null;
		
	}
}
