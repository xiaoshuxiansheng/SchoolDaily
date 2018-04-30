package com.sd.Admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.Admin.mapper.sd_studentMapper;
import com.sd.Admin.pojo.sd_student;
import com.sd.Admin.service.sd_studentService;
@Service
public class sd_studentServiceImpl implements sd_studentService {
@Autowired
sd_studentMapper mStudenMapper;
	@Override
	public List<sd_student> getStudents (String studentClass,String studentMajor,String studentGrade) {
		return mStudenMapper.getStudents(studentClass, studentMajor, studentGrade);
	}
	@Override
	public List<sd_student> getStudents() {
		
		return mStudenMapper.getStudentsList();
	}
	//修改
	@Override
	public void updateStudent(sd_student mStudent) {
		mStudenMapper.updateByPrimaryKey(mStudent);
		
	}

}
