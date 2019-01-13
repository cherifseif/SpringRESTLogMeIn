package com.persistance.service;

import java.util.List;

import com.persistance.model.Game;
import com.persistance.model.GameUser;
import com.persistance.model.User;

public interface IGameUserService {
	
	public void addGameUser(GameUser  gameUser);
	
	public List<GameUser> findAll();
	
	public GameUser findById(int id);
	
	public void updateGameUser(GameUser gameUser );
	
	public void deleteGameUser(GameUser gameUser );
	
	public List<GameUser> findByGameAndUser(Game game, User user );
	
	public List<GameUser> findByGame(Game game );

}
