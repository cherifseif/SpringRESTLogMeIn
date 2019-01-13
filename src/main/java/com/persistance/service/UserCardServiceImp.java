package com.persistance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.persistance.dao.IUserCardDAO;
import com.persistance.model.User;
import com.persistance.model.UserCard;


@Service
@Transactional
public class UserCardServiceImp implements IUserCardService {
	
	@Autowired
	IUserCardDAO userCardDAO;

	public void addUserCard(UserCard userCard) {
		// TODO Auto-generated method stub
		userCardDAO.addUserCard(userCard);
		
	}

	public List<UserCard> findAll() {
		// TODO Auto-generated method stub
		return userCardDAO.findAll();
	}

	public UserCard findById(int id) {
		// TODO Auto-generated method stub
		return userCardDAO.findById(id);
	}

	public void updateUserCard(UserCard userCard) {
		// TODO Auto-generated method stub
		userCardDAO.updateUserCard(userCard);
		
	}

	public void deleteUserCard(UserCard userCard) {
		// TODO Auto-generated method stub
		userCardDAO.deleteUserCard(userCard);
		
	}

	public List<UserCard> getAllCardByUser(User user) {
		return userCardDAO.getAllCardByUser(user);
	}

}
