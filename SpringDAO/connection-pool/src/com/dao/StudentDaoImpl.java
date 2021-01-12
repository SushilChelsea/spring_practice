package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.model.Student;

public class StudentDaoImpl implements StudentDao {

	private DataSource ds;
	
	public void setDs(DataSource ds) {
		this.ds = ds;
		System.out.println(ds);
	}

	@Override
	public int save(Student s) throws Exception {
		Connection con = ds.getConnection();
		System.out.println("Save Operation");
		con.close();
		return 0;
	}

	@Override
	public boolean update(Student s) throws Exception {
		Connection con = ds.getConnection();
		System.out.println("Update Operation");
		con.close();
		return false;
	}

	@Override
	public Student findById(int id) throws Exception {
		Connection con = ds.getConnection();
		System.out.println("Find Single Student Operation");
		con.close();
		return null;
	}

	@Override
	public List<Student> findAll() throws Exception {
		Connection con = ds.getConnection();
		PreparedStatement stmt=con.prepareStatement("select * from student"); 
		ResultSet rs=stmt.executeQuery();  
		List<Student> students = new ArrayList<>();
		while(rs.next()){  
			Student s = new Student();
			s.setIdStudent(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setArea(rs.getString(3));
			s.setCity(rs.getString(4));
			s.setPincode(rs.getString(5));
			
			students.add(s);
		} 
		con.close();
		return students;
	}

	@Override
	public List<Student> findByParam(Object[] o) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
