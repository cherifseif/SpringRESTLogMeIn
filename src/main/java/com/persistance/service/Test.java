package com.persistance.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.persistance.model.Card;
import com.persistance.model.Deck;
import com.persistance.model.DeckCard;
import com.persistance.model.Game;
import com.persistance.model.GameDeck;
import com.persistance.model.GameUser;
import com.persistance.model.User;
import com.persistance.model.UserCard;

public class Test {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IGameService gameService = (IGameService) applicationContext.getBean(IGameService.class);
		IUserService  userService  = (IUserService) applicationContext.getBean(IUserService.class);
		IGameUserService gameUserService =  (IGameUserService) applicationContext.getBean(IGameUserService.class);
		IGameDeckService gameDeckService =  (IGameDeckService) applicationContext.getBean(IGameDeckService.class);
		
		IDeckCardService deckCardService =  (IDeckCardService) applicationContext.getBean(IDeckCardService.class);
		
		IUserCardService userCardService = (IUserCardService) applicationContext.getBean(IUserCardService.class);

		ICardService  cardService =  (ICardService) applicationContext.getBean(ICardService.class);
		
		/*
		Game game = new Game();
		
		game.setIdGame(1);
		game.setNameGame("namegame");
		
		gameService.addGame(game);
		
		
		User user1 = new User();
		user1.setIdUser(1);
		user1.setNameUser("user name");
		user1.setNbReceiveCard(0);
		
		userService.addUser(user1);
		
		GameUser gameUser = new GameUser();
		gameUser.setGame(game);
		gameUser.setUser(user1);
		
		gameUserService.addGameUser(gameUser);
		
		*/
		
		/*
		List<Card> listCard = cardService.findAll();
		for(Card card: listCard){
			System.out.println(card.getIdCard() + " " + card.getColor() + " "+ card.getFace() + " " + card.getValue());
		}
		*/
		
	/*
		
		Game game = gameService.findById(5);
		
		User user =  new User();
		
		user.setIdUser(5);
		user.setNameUser("name");
		user.setNbReceiveCard(0);
		
		
		if(user.getNbReceiveCard() < 52){
			
			// find list Game deck
			List<GameDeck> listGameDeck = new ArrayList<GameDeck>();
			listGameDeck = gameDeckService.findByGame(game);
			
			boolean boolDeck = false;
			int i=0;
			Deck deck = new Deck(); 
			
			while( boolDeck== false && i<listGameDeck.size()){
				GameDeck gameDeck = (GameDeck ) listGameDeck.get(i);
				
				if(gameDeck.getDeck().getDeckCards().size() > 0 ) {
					boolDeck = true;
					deck = gameDeck.getDeck();
				}
				i++;
				
			}
			
			if(boolDeck==true){
				// find deck card
				List<DeckCard> listDeckCard = new ArrayList<DeckCard>();
				listDeckCard = deckCardService.findByDeck(deck);
				listDeckCard.size();
				
				// melonge des card
				Collections.shuffle(listDeckCard);
				
				// Card au hasard
				Random randomGenerator = new Random();
				int index = randomGenerator.nextInt(listDeckCard.size());
				DeckCard  deckCard = listDeckCard.get(index);
				deckCard.getIdDeckCard();
				
				Card card = new Card();
				card  = deckCard.getCard();
				
				UserCard userCard = new UserCard();
				userCard.setCard(card);
				userCard.setUser(user);
				
				userCardService.addUserCard(userCard);
				
				user.setNbReceiveCard(user.getNbReceiveCard()+1);
				userService.updateUser(user);
				
				deckCardService.deleteDeckCard(deckCard);
			
			}
			
		
		}else{
			System.out.println("");
		}
		
		
		*/
		
		/*
		Game game = gameService.findById(5);
		
		User user = new User();
		user.setIdUser(5);
		
		List<GameUser> listGameUser = new ArrayList<GameUser>();
		listGameUser = gameUserService.findByGameAndUser( game, user );
		
		boolean boolUser = false;
		int i=0;
		
		while( boolUser== false && i<listGameUser.size()){
			GameUser gameUser = (GameUser ) listGameUser.get(i);
			
			if(gameUser.getUser().getIdUser().equals(user.getIdUser()) ) {
				boolUser = true;
			}
			i++;
			
		}
		
		List<Card> lisCard = new ArrayList<Card>();
		
		if(boolUser==true){
			
			List<UserCard> listUserCard = new ArrayList<UserCard>();
			listUserCard = userCardService.getAllCardByUser(user);
			
			for(int j=0;j<listUserCard.size();j++){
				UserCard userCard = listUserCard.get(j);
				
				Card card  = new Card();
				card.setIdCard(userCard.getCard().getIdCard());
				card.setColor(userCard.getCard().getColor());
				card.setFace(userCard.getCard().getFace());
				card.setValue(userCard.getCard().getValue());
				
				lisCard.add(card);
			}
			
			
		}
		
		for(int l=0;l<lisCard.size();l++){
			System.out.println(lisCard.get(l).getIdCard());

		}
		
		*/
	
		/*  /// Short player score
		 * 
		Game game = gameService.findById(1);
	
		List<GameUser> listGameUser = new ArrayList<GameUser>();
		listGameUser = gameUserService.findByGame(game);
		
		List<User> listUser = new ArrayList<User>();
		
		for( int i=0; i<listGameUser.size();i++){
			GameUser gameUser = (GameUser ) listGameUser.get(i);
			
			User userObj = new User();
			userObj.setIdUser(gameUser.getUser().getIdUser());
			userObj.setNameUser(gameUser.getUser().getNameUser());
			userObj.setNbReceiveCard(gameUser.getUser().getNbReceiveCard());
			userObj.setScore(gameUser.getUser().getScore());
			
			listUser.add(userObj);
			
		}
		
		int scoreUser = 0;
		for(int j=0;j<listUser.size();j++){
			
			User userObj = listUser.get(j);
			
			List<UserCard> listUserCard = new ArrayList<UserCard>();
			
			listUserCard = userCardService.getAllCardByUser(userObj);
			
			scoreUser = 0;
			
			for(int k=0;k<listUserCard.size();k++){
				UserCard userCard = listUserCard.get(k);
				scoreUser = scoreUser + userCard.getCard().getValue(); 
				
			}
			
			userObj.setScore(scoreUser);
			userService.updateUser(userObj);
			
		}
		
		//tri par score
		  Collections.sort(listUser, User.ComparatorScore);
		
		for(int l=0;l<listUser.size();l++){
			System.out.println(listUser.get(l).getIdUser() + "  " +  listUser.get(l).getScore());

		}
		*/
		
		Game game = gameService.findById(1);
		String str = "";
		
		str = gameDeckService.getCardRemainning(game);
		
		System.out.println(str);
	}
	


}
