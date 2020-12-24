package com.reviewssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.reviewssm.pojo.Student;
import com.reviewssm.service.IStudentService;
import com.reviewssm.service.StudentService;

//@Controller
public class StudentController2 implements Controller {
	
	private IStudentService studentService;
	
	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}

//	private StudentService studentService;
//
//	public void setStudentService(StudentService studentService) {
//		this.studentService = studentService;
//	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Student> findAllStudents = studentService.findAllStudents();
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", findAllStudents);
		mav.setViewName("welcome");
		return mav;
	}
	
	public String gittest() {
		return null;
	}
	
	public String m2() {
		return null;
	}
	
}
