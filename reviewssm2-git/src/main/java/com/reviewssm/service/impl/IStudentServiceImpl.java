package com.reviewssm.service.impl;

import java.util.List;

import com.reviewssm.dao.IStudentDao;
import com.reviewssm.pojo.Student;
import com.reviewssm.service.IStudentService;

//@Service("studentService")
public class IStudentServiceImpl implements IStudentService {
	
	private IStudentDao studentDao;
	
	public void setStudentDao(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
//	@Autowired
//	@Qualifier("studentDao")
//	private StudentDao studentDao;
//	
//	public void setStudentDao(StudentDao studentDao) {
//		this.studentDao = studentDao;
//	}

	@Override
	public List<Student> findAllStudents() {
		return studentDao.selectAllStudents();
	}

	@Override
	public int saveStudent(Student stu) {
		return studentDao.insertStudent(stu);
	}

}
