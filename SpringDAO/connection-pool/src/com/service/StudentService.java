package com.service;

import java.util.List;

import com.model.Student;

public interface StudentService {
	public int createStudent(Student s);
	public boolean updateStudent(Student s);
	public Student findById(int id);
	public List<Student> findAll();
	public List<Student> findByParam(Object[] o);
}
