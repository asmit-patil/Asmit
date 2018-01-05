package com.niit.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Dao.OrderDao;

import com.niit.model.Order;

@Repository("OrderDaoImpl")
public class OrderDaoImpl implements OrderDao{


		@Autowired
		SessionFactory sessionFactory;
		
		@Autowired
		public OrderDaoImpl(SessionFactory sessionFactory){
			this.sessionFactory=sessionFactory;
		}
		
		public void insert(Order order){
			
			Session s=sessionFactory.openSession();
			s.beginTransaction();
			s.persist(order);
			s.getTransaction().commit();
			
		}
		
}
