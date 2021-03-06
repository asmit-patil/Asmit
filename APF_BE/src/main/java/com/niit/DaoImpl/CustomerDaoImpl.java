package com.niit.DaoImpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.niit.Dao.CustomerDao;
import com.niit.model.Customer;


@Repository
@Service
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	public CustomerDaoImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	public void insertCustomer(Customer cust){
		
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.persist(cust);
		s.getTransaction().commit();
		
	}
	
	public Customer findUserByEmail(String email)
	{
		Session s=sessionFactory.openSession();
		Customer c=null;
		try
		{
			s.beginTransaction();
			c=s.get(Customer.class, email);
			s.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			System.out.println(e.getMessage());
			s.getTransaction().rollback();
		}
		
		return c;
	}
	

}
