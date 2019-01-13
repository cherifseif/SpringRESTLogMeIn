package com.persistance.dao;

import java.util.List;

import com.persistance.model.User;
import com.persistance.model.UserCard;

public interface IUserDAO {
	
	public void addUser(User  user);
	
	public List<User> findAll();
	
	public User findById(int id);
	
	public void updateUser(User user );
	
	public void deleteUser(User user );

}
