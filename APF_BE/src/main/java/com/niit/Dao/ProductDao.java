package com.niit.Dao;

import java.util.List;

import com.niit.model.*;

public interface ProductDao {
		public void insertProduct(Product product);
		public List<Product> retrive();
		public Product findByPID(int i);
}
