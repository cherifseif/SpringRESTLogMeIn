package com.persistance.dao;

import java.util.List;

import com.persistance.model.Game;
import com.persistance.model.GameDeck;

public interface IGameDeckDAO {
	
	public void addGameDeck(GameDeck gameDeck);

	public List<GameDeck> findAll();

	public GameDeck findById(int id);

	public void updateGameDeck(GameDeck gameDeck);

	public void deleteGameDeck(GameDeck gameDeck);
	
	public List<GameDeck> findByGame(Game game);
	
	public String getCardRemainning(Game game);

}
