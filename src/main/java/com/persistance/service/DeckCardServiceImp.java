package com.persistance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.persistance.dao.IDeckCardDAO;
import com.persistance.model.Deck;
import com.persistance.model.DeckCard;

@Service
@Transactional
public class DeckCardServiceImp implements IDeckCardService{
	
	@Autowired
	IDeckCardDAO deckCardDAO;

	public void addDeckCard(DeckCard deckCard) {
		// TODO Auto-generated method stub
		deckCardDAO.addDeckCard(deckCard);
		
	}

	public List<DeckCard> findAll() {
		// TODO Auto-generated method stub
		return deckCardDAO.findAll();
	}

	public DeckCard findById(int id) {
		// TODO Auto-generated method stub
		return deckCardDAO.findById(id);
	}

	public void updateDeckCard(DeckCard deckCard) {
		// TODO Auto-generated method stub
		deckCardDAO.updateDeckCard(deckCard);
		
	}

	public void deleteDeckCard(DeckCard deckCard) {
		// TODO Auto-generated method stub
		deckCardDAO.deleteDeckCard(deckCard);
	}

	public List<DeckCard> findByDeck(Deck deck) {
		// TODO Auto-generated method stub
		return deckCardDAO.findByDeck(deck);
	}

}
