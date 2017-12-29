package com.niit.Dao;

import java.util.List;

import com.niit.model.Category;


public interface CategoryDao {
	
	public void insertCategory(Category category);
	public List<Category> retrive();
	public Category findByCatId(int i);
}
