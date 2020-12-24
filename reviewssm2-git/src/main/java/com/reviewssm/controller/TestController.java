package com.reviewssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reviewssm.pojo.Student;
import com.reviewssm.service.StudentService;

@Controller
public class TestController {
	
	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping("/findAllStudents.do")
	@ResponseBody
	public List<Student> findAllStudents() {
		return studentService.findAllStudents();
	}
	
	@RequestMapping("/saveStudent.do")
	public String saveStudent(Student stu) {
		int result = studentService.saveStudent(stu);
		System.out.println("添加了：" + result + " 条数据");
		return "welcome";
	}
	
}
