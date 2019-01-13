package com.persistance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.persistance.dao.ICardDAO;
import com.persistance.model.Card;

@Service
@Transactional
public class CardServiceImp implements ICardService{
	
	@Autowired
	ICardDAO  cardDAO;

	public void addCard(Card card) {
		// TODO Auto-generated method stub
		cardDAO.addCard(card);
		
	}

	public List<Card> findAll() {
		// TODO Auto-generated method stub
		return cardDAO.findAll();
	}

	public Card findById(int id) {
		// TODO Auto-generated method stub
		return cardDAO.findById(id);
	}

	public void updateCard(Card card) {
		// TODO Auto-generated method stub
		cardDAO.updateCard(card);
		
	}

	public void deleteCard(Card card) {
		// TODO Auto-generated method stub
		cardDAO.deleteCard(card);
		
	}

}
