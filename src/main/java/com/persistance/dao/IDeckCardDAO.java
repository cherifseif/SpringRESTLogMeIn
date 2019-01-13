package com.persistance.dao;

import java.util.List;

import com.persistance.model.Card;
import com.persistance.model.Deck;
import com.persistance.model.DeckCard;
import com.persistance.model.Game;
import com.persistance.model.GameDeck;

public interface IDeckCardDAO {

	public void addDeckCard(DeckCard deckCard);

	public List<DeckCard> findAll();

	public DeckCard findById(int id);

	public void updateDeckCard(DeckCard deckCard);

	public void deleteDeckCard(DeckCard deckCard);
	
	public List<DeckCard> findByDeck(Deck  deck);

}
