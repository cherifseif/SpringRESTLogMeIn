package com.persistance.service;

import java.util.List;

import com.persistance.model.Deck;
import com.persistance.model.DeckCard;

public interface IDeckCardService {
	
	public void addDeckCard(DeckCard deckCard);

	public List<DeckCard> findAll();

	public DeckCard findById(int id);

	public void updateDeckCard(DeckCard deckCard);

	public void deleteDeckCard(DeckCard deckCard);
	
	public List<DeckCard> findByDeck(Deck  deck);


}
