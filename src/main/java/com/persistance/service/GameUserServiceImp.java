package com.persistance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.persistance.dao.IGameUserDAO;
import com.persistance.model.Game;
import com.persistance.model.GameUser;
import com.persistance.model.User;


@Service
@Transactional
public class GameUserServiceImp implements IGameUserService {
	
	@Autowired
	IGameUserDAO gameUserDAO;

	public void addGameUser(GameUser gameUser) {
		// TODO Auto-generated method stub
		gameUserDAO.addGameUser(gameUser);
		
	}

	public List<GameUser> findAll() {
		// TODO Auto-generated method stub
		return gameUserDAO.findAll();
	}

	public GameUser findById(int id) {
		// TODO Auto-generated method stub
		return gameUserDAO.findById(id);
	}

	public void updateGameUser(GameUser gameUser) {
		// TODO Auto-generated method stub
		gameUserDAO.updateGameUser(gameUser);
		
	}

	public void deleteGameUser(GameUser gameUser) {
		// TODO Auto-generated method stub
		gameUserDAO.deleteGameUser(gameUser);
		
	}

	public List<GameUser> findByGameAndUser(Game game, User user ) {
		// TODO Auto-generated method stub
		return gameUserDAO.findByGameAndUser(  game,   user );
	}

	public List<GameUser> findByGame(Game game) {
		// TODO Auto-generated method stub
		return gameUserDAO.findByGame(game);
	}

}
