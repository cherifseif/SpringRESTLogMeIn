package com.persistance.service;

import java.util.List;

import com.persistance.model.Card;
import com.persistance.model.User;
import com.persistance.model.UserCard;

public interface IUserCardService {
	
	public void addUserCard(UserCard userCard);
	
	public List<UserCard> findAll();
	
	public UserCard findById(int id);
	
	public void updateUserCard(UserCard userCard);
	
	public void deleteUserCard(UserCard userCard);
	
	public List<UserCard> getAllCardByUser(User  user );


}
