package com.persistance.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.persistance.model.Card;
import com.persistance.model.Deck;
import com.persistance.model.DeckCard;
import com.persistance.model.GameDeck;


@Repository
public class DeckCardDAOImp implements IDeckCardDAO{
	
	
	@Autowired
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	

	public void addDeckCard(DeckCard deckCard) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(deckCard);
		
	}

	public List<DeckCard> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from DeckCard").list();
	}

	public DeckCard findById(int id) {
		// TODO Auto-generated method stub
		return (DeckCard) sessionFactory.getCurrentSession().get(DeckCard.class, id);
	}

	public void updateDeckCard(DeckCard deckCard) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(deckCard);
		
	}

	public void deleteDeckCard(DeckCard deckCard) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(deckCard);
		
	}

	public List<DeckCard> findByDeck(Deck deck) {
		// TODO Auto-generated method stub
		
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(DeckCard.class);
		
		criteria.add( Restrictions.eq("deck.idDeck", deck.getIdDeck() ) );
		
		List<DeckCard> listDeckCard = criteria.list();
		
		return listDeckCard;
	}

}
