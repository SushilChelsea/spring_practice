package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {
	public int save(Student s) throws Exception;
	public boolean update(Student s) throws Exception;
	public Student findById(int id) throws Exception;
	public List<Student> findAll() throws Exception;
	public List<Student> findByParam(Object[] o) throws Exception;
}
