package com.persistance.service;

import java.util.List;

import com.persistance.model.Deck;

public interface IDeckService {
	
	public void addDeck(Deck deck);

	public List<Deck> findAll();

	public Deck findById(int id);

	public void updateDeck(Deck deck);

	public void deleteDeck(Deck deck);

}
