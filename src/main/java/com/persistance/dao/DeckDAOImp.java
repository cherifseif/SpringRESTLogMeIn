package com.persistance.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.persistance.model.Deck;


@Repository
public class DeckDAOImp implements IDeckDAO {

	
	@Autowired
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public void addDeck(Deck deck) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(deck);
		
	}

	public List<Deck> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Deck").list();
	}

	public Deck findById(int id) {
		// TODO Auto-generated method stub
		return (Deck) sessionFactory.getCurrentSession().get(Deck.class, id);
	}

	public void updateDeck(Deck deck) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(deck);
		
	}

	public void deleteDeck(Deck deck) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(deck);
		
	}

}
