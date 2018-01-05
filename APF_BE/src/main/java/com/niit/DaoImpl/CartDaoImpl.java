package com.niit.DaoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Dao.CartDao;
import com.niit.model.*;


@Repository("CartDaoImpl")
public class CartDaoImpl implements CartDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	public CartDaoImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	public void insert(Cart cart){
		
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.persist(cart);
		s.getTransaction().commit();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Cart> findByCartId(String userId)
	{
		Session s=sessionFactory.openSession();
		List<Cart> cr=null;
		try
		{
			s.beginTransaction();
			cr=(List<Cart>)s.createQuery("from Cart where userMailId:=email").setString("email", userId).list();
			s.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			s.getTransaction().rollback();
		}
		return cr;
	}
	
	public Cart getCartById(int cartId, String userEmail){
		Session s=sessionFactory.openSession();
		Cart cr=null;
		s.beginTransaction();
		cr = (Cart)s.createQuery("from Cart where userMailId=: email and cartProductId=: pid");
		s.getTransaction().commit();
		return cr;
	}
	
	public void deleteCart(int cartId)
	{
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		Cart cr=(Cart)s.get(Cart.class, cartId);
		s.delete(cr);
		s.getTransaction().commit();
	}
	
	public void updateCart(Cart cr){
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.update(cr);
		s.getTransaction().commit();
	}
	
	
	
	
	
	
	
	
	
	
}
