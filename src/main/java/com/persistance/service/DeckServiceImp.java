package com.persistance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.persistance.dao.IDeckDAO;
import com.persistance.model.Deck;

@Service
@Transactional
public class DeckServiceImp implements IDeckService {
	
	@Autowired
	IDeckDAO  deckDAO;
	
	public void addDeck(Deck deck) {
		// TODO Auto-generated method stub
		deckDAO.addDeck(deck);
		
	}

	public List<Deck> findAll() {
		// TODO Auto-generated method stub
		return deckDAO.findAll();
	}

	public Deck findById(int id) {
		// TODO Auto-generated method stub
		return deckDAO.findById(id);
	}

	public void updateDeck(Deck deck) {
		// TODO Auto-generated method stub
		deckDAO.updateDeck(deck);
	}

	public void deleteDeck(Deck deck) {
		// TODO Auto-generated method stub
		deckDAO.deleteDeck(deck);
		
	}

}
