package com.persistance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.persistance.dao.IGameDeckDAO;
import com.persistance.model.Game;
import com.persistance.model.GameDeck;


@Service
@Transactional
public class GameDeckServiceImp implements IGameDeckService{
	
	@Autowired
	IGameDeckDAO gameDeckDAO;

	public void addGameDeck(GameDeck gameDeck) {
		// TODO Auto-generated method stub
		gameDeckDAO.addGameDeck(gameDeck);
		
	}

	public List<GameDeck> findAll() {
		// TODO Auto-generated method stub
		return gameDeckDAO.findAll();
	}

	public GameDeck findById(int id) {
		// TODO Auto-generated method stub
		return gameDeckDAO.findById(id);
	}

	public void updateGameDeck(GameDeck gameDeck) {
		// TODO Auto-generated method stub
		gameDeckDAO.updateGameDeck(gameDeck);
		
	}

	public void deleteGameDeck(GameDeck gameDeck) {
		// TODO Auto-generated method stub
		gameDeckDAO.deleteGameDeck(gameDeck);
		
	}

	public List<GameDeck> findByGame(Game game) {
		// TODO Auto-generated method stub
		return gameDeckDAO.findByGame(game);
	}

	public String getCardRemainning(Game game) {
		// TODO Auto-generated method stub
		return gameDeckDAO.getCardRemainning(game);
	}

}
