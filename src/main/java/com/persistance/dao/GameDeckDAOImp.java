package com.persistance.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.persistance.model.Game;
import com.persistance.model.GameDeck;
import com.persistance.model.GameUser;

@Repository
public class GameDeckDAOImp implements IGameDeckDAO{

	
	@Autowired
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void addGameDeck(GameDeck gameDeck) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(gameDeck);
		
	}

	public List<GameDeck> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from GameDeck").list();
	}

	public GameDeck findById(int id) {
		// TODO Auto-generated method stub
		return (GameDeck) sessionFactory.getCurrentSession().get(GameDeck.class, id);
	}

	public void updateGameDeck(GameDeck gameDeck) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(gameDeck);
		
	}

	public void deleteGameDeck(GameDeck gameDeck) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(gameDeck);
		
	}

	public List<GameDeck> findByGame(Game game) {
		// TODO Auto-generated method stub
		
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(GameDeck.class);
		
		criteria.add( Restrictions.eq("game.idGame", game.getIdGame() ) );
		
		List<GameDeck> listGameDeck = criteria.list();
		
		return listGameDeck;
	}

	public String getCardRemainning(Game game) {
		// TODO Auto-generated method stub
		
		String hql1 = "select card.color, count(deck_card.id_card)  from card, deck_card, deck, game_deck, game "+
						"where card.id_card = deck_card.id_card "+
						"and deck.id_deck = game_deck.id_deck "+
						"and game_deck.id_game = game.id_game "+
						"and game.id_game ="+ game.getIdGame().intValue() +" "+
						"group by card.color" ;
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery(hql1);
				
		List<Object[]> rows = query.list();
		String strResult = "//";
		for(Object[] row : rows){
			strResult = strResult + row[0].toString() + " : " + row[1].toString() +"//" ; 
		
		}
		return strResult;
	}

}
