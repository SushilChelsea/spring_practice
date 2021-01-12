package com.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.model.Student;

public class StudentDaoJTImp implements StudentDao {

	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int save(Student s) throws Exception {
		System.out.println(jt + "\nSave Operation");
		return 0;
	}

	@Override
	public boolean update(Student s) throws Exception {
		System.out.println(jt + "\nUpdate Operation");
		return false;
	}

	@Override
	public Student findById(int id) throws Exception {
		String sql = "select * from student where idstudent=?";
		Student s = (Student) jt.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Student>(Student.class));
		return s;
	}

	@Override
	public List<Student> findAll() throws Exception {
		String sql = "select * from student";
		return jt.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
	}

	@Override
	public List<Student> findByParam(Object[] o) throws Exception {
		String sql = "select * from student where area=? and city=?";
		return jt.query(sql, o, new BeanPropertyRowMapper<Student>(Student.class));
	}

}
