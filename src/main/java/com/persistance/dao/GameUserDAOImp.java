package com.persistance.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.persistance.model.Game;
import com.persistance.model.GameUser;
import com.persistance.model.User;


@Repository
public class GameUserDAOImp implements IGameUserDAO {

	
	@Autowired
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void addGameUser(GameUser gameUser) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(gameUser);
		
	}

	public List<GameUser> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from GameUser").list();
	}

	public GameUser findById(int id) {
		// TODO Auto-generated method stub
		return (GameUser) sessionFactory.getCurrentSession().get(GameUser.class, id);
	}

	public void updateGameUser(GameUser gameUser) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(gameUser);
		
	}

	public void deleteGameUser(GameUser gameUser) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(gameUser);
		
	}

	public List<GameUser> findByGameAndUser(Game game, User user ) {
		// TODO Auto-generated method stub
		
		String hql = "from GameUser where game.idGame = :id1 and user.idUser = :id2";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		query.setInteger("id1", game.getIdGame());
		query.setInteger("id2", user.getIdUser());

		List<GameUser> results = query.list();
		
		return results;
	}

	public List<GameUser> findByGame(Game game) {
		// TODO Auto-generated method stub
		String hql = "from GameUser where game.idGame = :id1 ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		query.setInteger("id1", game.getIdGame());

		List<GameUser> results = query.list();
		
		return results;
	}

}
