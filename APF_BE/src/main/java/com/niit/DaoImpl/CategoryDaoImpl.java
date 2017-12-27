package com.niit.DaoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.niit.Dao.*;
import com.niit.model.*;

@Repository
@Service
public class CategoryDaoImpl implements CategoryDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	public CategoryDaoImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	public void insertCategory(Category category){
		
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.persist(category);
		s.getTransaction().commit();
		
	}
	
	public List<Category> retrive(){
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		List<Category> li=s.createQuery("from Category").list();
		s.getTransaction().commit();
		return li;
		
	}
	
	public Category findByCatId(int cid)
	{
		Session s=sessionFactory.openSession();
		Category c=null;
		try
		{
			s.beginTransaction();
			c=s.get(Category.class, cid);
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
