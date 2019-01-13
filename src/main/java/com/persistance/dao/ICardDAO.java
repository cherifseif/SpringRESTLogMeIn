package com.persistance.dao;

import java.util.List;

import com.persistance.model.Card;

public interface ICardDAO {
	
	public void addCard(Card card);
	
	public List<Card> findAll();
	
	public Card findById(int id);
	
	public void updateCard(Card card);
	
	public void deleteCard(Card card);
	
	
	
	

}
