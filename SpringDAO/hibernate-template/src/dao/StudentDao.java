package dao;

import java.util.List;

import model.Student;

public interface StudentDao {
	public int save(Student s) throws Exception;
	public boolean update(Student s) throws Exception;
	public Student findById(int id) throws Exception;
	public List<Student> findAllUsingHQL() throws Exception;
	public List<Student> findAllUsingCriteria();
	public List<Student> findByParam(Object[] o) throws Exception;
}
