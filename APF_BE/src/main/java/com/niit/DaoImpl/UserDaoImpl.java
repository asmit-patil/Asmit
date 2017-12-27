package com.niit.DaoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;
import com.niit.Dao.UserDao;
import com.niit.model.User;

public class UserDaoImpl implements UserDao{
	public static Logger log = LoggerFactory.getLogger(UserDaoImpl.class);

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	@SuppressWarnings("unchecked")
	@Transactional
		public List<User> getUsers() {
			String hql = "from User";

			Query query = sessionFactory.getCurrentSession().createQuery(hql);

			return query.list();
		}
	@Transactional
	public User getUserById(String id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);

	}
	@Transactional
	public boolean save(User user) {
		try {
			sessionFactory.getCurrentSession().save(user);
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
}
