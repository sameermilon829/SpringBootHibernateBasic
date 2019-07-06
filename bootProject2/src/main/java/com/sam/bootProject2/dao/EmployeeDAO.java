package com.sam.bootProject2.dao;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO implements IEmployeeDAO {
	
	/*@Autowired
	SessionFactory sessionFactory;*/

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public String fetchEmployeeById(Long id) {
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Query query = session.createNativeQuery("select e.emp_name from Employee e where e.emp_id=:id");
		query.setParameter("id", id);
		String s =(String) query.uniqueResult();
		return s;
	}

}
