package com.niit.DaoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.niit.Dao.ProductDao;
import com.niit.model.Category;
import com.niit.model.Product;

@Repository
@Service
public class ProductDaoImpl  implements ProductDao{
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	public ProductDaoImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	public void insertProduct(Product product){
		
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.persist(product);
		s.getTransaction().commit();
		
	}
	
	public List<Product> retrive(){
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		List<Product> li=s.createQuery("from Product").list();
		s.getTransaction().commit();
		return li;
		
	}
	
	public Product findByPID(int pid)
	{
		Session s=sessionFactory.openSession();
		Product prod=null;
		try
		{
			s.beginTransaction();
			prod=s.get(Product.class, pid);
			s.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			System.out.println(e.getMessage());
			s.getTransaction().rollback();
		}
		
		return prod;
	}
	
	public List<Product> findprodByCatId(int cid)
	{
		Session s=sessionFactory.openSession();
		List<Product> p=null;
		try
		{
			s.beginTransaction();
			p=s.createQuery("from Product where cid="+cid).list();
			s.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			s.getTransaction().rollback();
		}
		
		return p;
	}
	
	public void update(Product p)
	{
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.update(p);
		s.getTransaction().commit();
	}
	
	public void deleteProd(int pid)
	{
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		Product p=(Product)s.get(Product.class, pid);
		s.delete(p);
		s.getTransaction().commit();
	}
	
	
	
}
