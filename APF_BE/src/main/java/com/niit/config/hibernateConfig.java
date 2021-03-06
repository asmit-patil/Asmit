package com.niit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import com.niit.DaoImpl.*;
import com.niit.model.*;

@Configuration
@ComponentScan("com.niit")
@EnableTransactionManagement
public class hibernateConfig {
	// Change the below based on the DBMS you choose
		private final static String DATABASE_URL = "jdbc:h2:tcp://localhost/~/onlineshopping";
		private final static String DATABASE_DRIVER = "org.h2.Driver";
		private final static String DATABASE_DIALECT = "org.hibernate.dialect.H2Dialect";
		private final static String DATABASE_USERNAME = "sa";
		private final static String DATABASE_PASSWORD = "";
		
		// dataSource bean will be available
		@Bean("dataSource")
		public DataSource getDataSource() {
			
			BasicDataSource dataSource = new BasicDataSource();
			
			// Providing the database connection information
			dataSource.setDriverClassName(DATABASE_DRIVER);
			dataSource.setUrl(DATABASE_URL);
			dataSource.setUsername(DATABASE_USERNAME);
			dataSource.setPassword(DATABASE_PASSWORD);
			System.out.println("H2 CONNECTED........")	;	
			
			return dataSource;
			
		}
		
		// All the hibernate properties will be returned in this method	
				private Properties getHibernateProperties() {
					
					Properties properties = new Properties();
					
					
					properties.put("hibernate.dialect", DATABASE_DIALECT);		
					properties.put("hibernate.hbm2ddl.auto", "update");
					properties.put("hibernate.show_sql", "true");
					properties.put("hibernate.format_sql", "true");
					
					
					System.out.println("TABLES CREATED........")	;
					
					return properties;
				}
				
				
		
		// sessionFactory bean will be available
		@Autowired
		@Bean
		public SessionFactory getSessionFactory(DataSource dataSource) {
			
			LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
			
			builder.addProperties(getHibernateProperties());
			builder.scanPackages("com.niit.APF_BE.model");
			builder.addAnnotatedClass(Customer.class);
			builder.addAnnotatedClass(Supplier.class);
			builder.addAnnotatedClass(Category.class);
			builder.addAnnotatedClass(Product.class);
			builder.addAnnotatedClass(Cart.class);
			builder.addAnnotatedClass(Order.class);
			return builder.buildSessionFactory();
			
		}

		
		
		@Autowired
		@Bean(name="CustomerDaoImpl")
		public CustomerDaoImpl saveUserData(SessionFactory sf) 
		{
			return new CustomerDaoImpl(sf);
		}
		
		@Autowired
		@Bean(name="SupplierDaoImpl")
		public SupplierDaoImpl saveSupplierData(SessionFactory sf) 
		{
			return new SupplierDaoImpl(sf);
		}
		
		@Autowired
		@Bean(name="CategoryDaoImpl")
		public CategoryDaoImpl saveCategoryData(SessionFactory sf) 
		{
			return new CategoryDaoImpl(sf);
		}
		
		@Autowired
		@Bean(name="ProductDaoImpl")
		public ProductDaoImpl saveProductData(SessionFactory sf) 
		{
			return new ProductDaoImpl(sf);
		}
		
		@Autowired
		@Bean(name="CartDaoImpl")
		public CartDaoImpl saveCartData(SessionFactory sf) 
		{
			return new CartDaoImpl(sf);
		}
		
		@Autowired
		@Bean(name="OrderDaoImpl")
		public OrderDaoImpl saveOrderData(SessionFactory sf) 
		{
			return new OrderDaoImpl(sf);
		}
		
		// transactionManager bean
		@Bean
		public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
			HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
			return transactionManager;
		}
		
}
