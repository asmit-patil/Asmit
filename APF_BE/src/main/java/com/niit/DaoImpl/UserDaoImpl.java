package com.niit.DaoImpl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.niit.Dao.UserDao;
import com.niit.model.User;

@Repository
@Service
public class UserDaoImpl implements UserDao{
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void insertUser(User user) {
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.persist(user);
		s.getTransaction().commit();
	}
}
