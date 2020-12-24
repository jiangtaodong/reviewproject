package com.reviewssm.service;

import java.util.List;

import com.reviewssm.pojo.Student;

public interface StudentService {
	
	List<Student> findAllStudents();
	int saveStudent(Student stu);
	
}
