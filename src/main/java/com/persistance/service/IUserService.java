package com.persistance.service;

import java.util.List;

import com.persistance.model.User;

public interface IUserService {
	
	public void addUser(User  user);
	
	public List<User> findAll();
	
	public User findById(int id);
	
	public void updateUser(User user );
	
	public void deleteUser(User user );

}
