package com.niit.Dao;

import java.util.List;

import com.niit.model.User;

public interface UserDao {
	public List<User> getUsers();
	public boolean save(User user);
	public User getUserById(String id);
}
