package com.reviewssm.dao;

import java.util.List;

import com.reviewssm.pojo.Student;

public interface StudentDao {
	
	List<Student> selectAllStudents();
	int insertStudent(Student stu);
	
}
