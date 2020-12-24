package com.reviewssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.reviewssm.dao.StudentDao;
import com.reviewssm.pojo.Student;
import com.reviewssm.service.StudentService;

//@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
//	@Autowired
//	@Qualifier("studentDao")
	private StudentDao studentDao;
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public List<Student> findAllStudents() {
		return studentDao.selectAllStudents();
	}

	@Override
	public int saveStudent(Student stu) {
		return studentDao.insertStudent(stu);
	}

}
