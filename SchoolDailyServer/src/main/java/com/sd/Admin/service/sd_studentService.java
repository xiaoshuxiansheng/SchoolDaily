package com.sd.Admin.service;

import java.util.List;

import com.sd.Admin.pojo.sd_student;
import com.sd.Admin.pojo.sd_user;

public interface sd_studentService {

	List<sd_student >getStudents(String studentClass,String studentMajor,String studentGrade);

	//获取所有学生无条件
	List<sd_student> getStudents();

	void updateStudent(sd_student mStudent);

}
