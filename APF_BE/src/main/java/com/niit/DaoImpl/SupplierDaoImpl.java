package com.niit.DaoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.niit.Dao.*;
import com.niit.model.Supplier;

@Repository
@Service
public class SupplierDaoImpl implements SupplierDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	public SupplierDaoImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	public void insertSupplier(Supplier supplier){
		
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.persist(supplier);
		s.getTransaction().commit();
		
	}
	
	public List<Supplier> retrive(){
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		List<Supplier> li= s.createQuery("from Supplier").list();
		s.getTransaction().commit();
		return li;
		
	}
	
	public Supplier findBySuppId(int sid)
	{
		Session s=sessionFactory.openSession();
		Supplier supplier=null;
		try
		{
			s.beginTransaction();
			supplier=s.get(Supplier.class, sid);
			s.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			System.out.println(e.getMessage());
			s.getTransaction().rollback();
		}
		
		return supplier;
	}
}
