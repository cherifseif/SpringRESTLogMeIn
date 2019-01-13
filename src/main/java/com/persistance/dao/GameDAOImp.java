package com.persistance.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.persistance.model.Game;


@Repository
public class GameDAOImp implements IGameDAO{
	
	@Autowired
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void addGame(Game game) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(game);
		
	}

	public List<Game> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Game").list();
	}

	public Game findById(int id) {
		// TODO Auto-generated method stub
		return (Game) sessionFactory.getCurrentSession().get(Game.class, id);
	}

	public void updateGame(Game game) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(game);
		
	}

	public void deleteGame(Game game) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(game);
		
	}

}
