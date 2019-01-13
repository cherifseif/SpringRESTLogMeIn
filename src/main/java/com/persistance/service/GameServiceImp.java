package com.persistance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.persistance.dao.IGameDAO;
import com.persistance.model.Game;


@Service
@Transactional
public class GameServiceImp implements IGameService {
	
	
	@Autowired
	IGameDAO gameDAO;
	
	
	public void addGame(Game game) {
		// TODO Auto-generated method stub
		gameDAO.addGame(game);
		
	}

	public List<Game> findAll() {
		// TODO Auto-generated method stub
		return gameDAO.findAll();
	}

	public Game findById(int id) {
		// TODO Auto-generated method stub
		return gameDAO.findById(id);
	}

	public void updateGame(Game game) {
		// TODO Auto-generated method stub
		gameDAO.updateGame(game);
		
	}

	public void deleteGame(Game game) {
		// TODO Auto-generated method stub
		gameDAO.deleteGame(game);
		
	}

}
