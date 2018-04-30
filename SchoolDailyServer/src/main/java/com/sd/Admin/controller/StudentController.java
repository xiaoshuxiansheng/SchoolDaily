package com.sd.Admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sd.Admin.pojo.sd_student;
import com.sd.Admin.service.sd_studentService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("admin")
public class StudentController {
	@Autowired
	sd_studentService mStudentService;
	@RequestMapping("student")
	public String table() {
		return "pages_student";
	}

	//学生
	@RequestMapping("getstudents")
	public @ResponseBody List<sd_student> getstudents() {
		return mStudentService.getStudents();
	}
	//学生修改
	//{"studentid":"14790106","name":"大明","phone":"17674352451","idcard":"4331221995042222341121",
	//"issign":"0","signtime":"0","pictrue":"","kpl":"99","vocate":"0","class":"二班",
	//"major":"计算机科学与技术","grade":"2015级","submit":"提交 "}
	@RequestMapping("updatestudent")
	public void updatestudent(@RequestBody String str) {
		JSONObject json=JSONObject.fromObject(str);
		System.err.println(str);
		sd_student mStudent=new sd_student();
		mStudent.setStudentClass(json.getString("studentclass"));
		mStudent.setStudentGrade(json.getString("grade"));
		mStudent.setStudentId(json.getString("studentid"));
		mStudent.setStudentIdcard(json.getString("idcard"));
		mStudent.setStudentIssign(json.getInt("issign"));
		mStudent.setStudentKpl(json.getInt("kpl"));
		mStudent.setStudentMajor(json.getString("major"));
		mStudent.setStudentName(json.getString("name"));
		mStudent.setStudentPhone(json.getString("phone"));
		mStudent.setStudentPictrue(json.getString("pictrue"));
		mStudent.setStudentSigntime(json.getString("signtime"));
		mStudent.setStudentVocate(json.getInt("vocate"));
		mStudentService.updateStudent(mStudent);
	}
}
