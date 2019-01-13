package com.persistance.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.persistance.model.Card;


@Repository
public class CardDAOImp implements ICardDAO {

	
	@Autowired
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public void addCard(Card card) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(card);
		
	}

	public List<Card> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Card").list();
		
		
	}


	public Card findById(int id) {
		// TODO Auto-generated method stub
		return (Card) sessionFactory.getCurrentSession().get(Card.class, id);
	}


	public void updateCard(Card card) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(card);
		
	}


	public void deleteCard(Card card) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(card);
		
	}

}
