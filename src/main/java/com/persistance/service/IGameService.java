package com.persistance.service;

import java.util.List;

import com.persistance.model.Game;

public interface IGameService {

	public void addGame(Game game);

	public List<Game> findAll();

	public Game findById(int id);

	public void updateGame(Game game);

	public void deleteGame(Game game);

}
