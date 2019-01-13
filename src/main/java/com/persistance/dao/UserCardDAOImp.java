package com.persistance.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.persistance.model.Card;
import com.persistance.model.GameUser;
import com.persistance.model.User;
import com.persistance.model.UserCard;


@Repository
public class UserCardDAOImp implements IUserCardDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addUserCard(UserCard userCard) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(userCard);
		
	}

	public List<UserCard> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from UserCard").list();
	}

	public UserCard findById(int id) {
		// TODO Auto-generated method stub
		return (UserCard) sessionFactory.getCurrentSession().get(UserCard.class, id);
	}

	public void updateUserCard(UserCard userCard) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(userCard);
		
	}

	public void deleteUserCard(UserCard userCard) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(userCard);
	}

	public List<UserCard> getAllCardByUser(User user) {
	// TODO Auto-generated method stub
		
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(UserCard.class);
		
		criteria.add( Restrictions.eq("user.idUser", user.getIdUser()) );
		
		List<UserCard> listUserCard = criteria.list();
		
		return listUserCard;
	}

}
