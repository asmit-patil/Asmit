package com.niit.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.UserDao;
import com.niit.model.User;

public class UserDaoImpl implements UserDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	public UserDaoImpl()
	{
		super();
		this.sessionFactory= sessionFactory;
	}
	
	@Transactional
	public void insertUser(User user){
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.persist(user);
		s.getTransaction().commit();
	}
}
