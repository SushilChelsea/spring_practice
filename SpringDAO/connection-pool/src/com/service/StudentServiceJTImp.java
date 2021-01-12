package com.service;

import java.util.List;

import com.dao.StudentDao;
import com.model.Student;

public class StudentServiceJTImp implements  StudentService {

	private StudentDao studentDao;
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
		System.out.println(studentDao);
	}
	
	@Override
	public int createStudent(Student s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateStudent(Student s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student findById(int id) {
		try {
			return studentDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Student> findAll() {
		try {
			return studentDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Student> findByParam(Object[] o) {
		try {
			return studentDao.findByParam(o);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
