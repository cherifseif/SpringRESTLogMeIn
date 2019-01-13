package com.persistance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.persistance.dao.IUserDAO;
import com.persistance.model.User;


@Service
@Transactional
public class UserServiceImp implements IUserService{
	
	@Autowired
	IUserDAO userDAO;

	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDAO.addUser(user);
		
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}

	public User findById(int id) {
		// TODO Auto-generated method stub
		return userDAO.findById(id);
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDAO.updateUser(user);
		
	}

	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		userDAO.deleteUser(user);
		
	}

}
