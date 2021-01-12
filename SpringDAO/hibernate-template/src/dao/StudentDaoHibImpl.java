package dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import model.Student;

public class StudentDaoHibImpl implements StudentDao{

	private HibernateTemplate ht;
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public int save(Student s) throws Exception {
		int id = (Integer) ht.save(s);
		return id;
	}

	@Override
	public boolean update(Student s) throws Exception {
		ht.update(s);
		return true;
	}

	@Override
	public Student findById(int id) throws Exception {
		return ht.get(Student.class, id);
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<Student> findAllUsingHQL() throws Exception {
		return (List<Student>) ht.find("from Student");
	}

	@Override
	public List<Student> findByParam(Object[] o) throws Exception {
		return null;
	}

	@Override
	public List<Student> findAllUsingCriteria() {
		DetachedCriteria dc = DetachedCriteria.forClass(Student.class);
		@SuppressWarnings("unchecked")
		List<Student> students = (List<Student>) ht.findByCriteria(dc);
		return students;
	}

}
