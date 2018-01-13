package com.DaoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.Dao.SupplierDao;
import com.model.Product;
import com.model.Supplier;

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
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.persist(supplier);
		session.getTransaction().commit();
		
	}
	

	public List<Supplier> retrive(){
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		List<Supplier> li= session.createQuery("from Supplier").list();
		session.getTransaction().commit();
		return li;
		
	}
	
	public Supplier findBySuppId(int sid)
	{
		Session session=sessionFactory.openSession();
		Supplier supplier=null;
		try
		{
			session.beginTransaction();
			supplier=session.get(Supplier.class, sid);
			session.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		}
		
		return supplier;
	}

	public void updateSupp(Supplier s)
	{
		Session session	=sessionFactory.openSession();
		session.beginTransaction();
		session.update(s);
		session.getTransaction().commit();
	}
	
	public void deleteSupp(int sid)
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Supplier s=(Supplier)session.get(Supplier.class, sid);
		session.delete(s);
		session.getTransaction().commit();
	}
}
