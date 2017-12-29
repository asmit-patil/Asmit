package com.niit.Dao;

import java.util.List;


import com.niit.model.Supplier;

public interface SupplierDao {
	
	public void insertSupplier(Supplier supplier);
	public List<Supplier> retrive();
	public Supplier findBySuppId(int i);
}
