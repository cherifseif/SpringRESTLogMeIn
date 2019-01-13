package com.persistance.ws.rest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.persistance.model.Card;
import com.persistance.model.Deck;
import com.persistance.model.DeckCard;
import com.persistance.model.Game;
import com.persistance.model.GameDeck;
import com.persistance.model.GameUser;
import com.persistance.model.User;
import com.persistance.model.UserCard;
import com.persistance.service.ICardService;
import com.persistance.service.IDeckCardService;
import com.persistance.service.IDeckService;
import com.persistance.service.IGameDeckService;
import com.persistance.service.IGameService;
import com.persistance.service.IGameUserService;
import com.persistance.service.IUserCardService;
import com.persistance.service.IUserService;



@RestController
public class PokerRestController {
	
	@Autowired
	private IGameService gameService;
	@Autowired
	private IGameDeckService gameDeckService;
	@Autowired
	private IDeckService deckService;
	@Autowired
	private IDeckCardService deckCardService;
	@Autowired
	private ICardService cardService;
	@Autowired
	private IGameUserService gameUserService;
	@Autowired
	private IUserService userService;
	@Autowired
	private IUserCardService userCardService ;
	
	
	private int MAX_DEAL_CARD = 52; 
	
	@PostMapping("/rest/game/addCard")
	public void createCard(){
		
		List<Card> listCard = new ArrayList<Card>();
		listCard = cardService.findAll();
		
		if(listCard==null || listCard.size()<MAX_DEAL_CARD){
			Card c1 = new Card(1 , "hearts" , "Ace", 1);
			Card c2 = new Card(2 , "hearts" , "Two", 2);
			Card c3 = new Card(3 , "hearts" , "Three", 3);
			Card c4 = new Card(4 , "hearts" , "Four", 4);
			Card c5 = new Card(5 , "hearts" , "Five", 5);
			Card c6 = new Card(6 , "hearts" , "Six", 6);
			Card c7 = new Card(7 , "hearts" , "Seven", 7);
			Card c8 = new Card(8 , "hearts" , "Eight", 8);
			Card c9 = new Card(9 , "hearts" , "Nine", 9);
			Card c10 = new Card(10 , "hearts" , "Ten", 10);
			Card c11 = new Card(11 , "hearts" , "Jack", 16);
			Card c12 = new Card(12 , "hearts" , "Queen", 19);
			Card c13 = new Card(13 , "hearts" , "King", 23);
			
			Card c14 = new Card(14 , "spades" , "Ace", 1);
			Card c15 = new Card(15 , "spades" , "Two", 2);
			Card c16 = new Card(16 , "spades" , "Three", 3);
			Card c17 = new Card(17 , "spades" , "Four", 4);
			Card c18 = new Card(18 , "spades" , "Five", 5);
			Card c19 = new Card(19 , "spades" , "Six", 6);
			Card c20 = new Card(20 , "spades" , "Seven", 7);
			Card c21 = new Card(21 , "spades" , "Eight", 8);
			Card c22 = new Card(22 , "spades" , "Nine", 9);
			Card c23 = new Card(23 , "spades" , "Ten", 10);
			Card c24 = new Card(24 , "spades" , "Jack", 16);
			Card c25 = new Card(25 , "spades" , "Queen", 19);
			Card c26 = new Card(26 , "spades" , "King", 23);
			
			Card c27 = new Card(27 , "clubs" , "Ace", 1);
			Card c28 = new Card(28 , "clubs" , "Two", 2);
			Card c29 = new Card(29 , "clubs" , "Three", 3);
			Card c30 = new Card(30 , "clubs" , "Four", 4);
			Card c31 = new Card(31 , "clubs" , "Five", 5);
			Card c32 = new Card(32 , "clubs" , "Six", 6);
			Card c33 = new Card(33 , "clubs" , "Seven", 7);
			Card c34 = new Card(34 , "clubs" , "Eight", 8);
			Card c35 = new Card(35 , "clubs" , "Nine", 9);
			Card c36 = new Card(36 , "clubs" , "Ten", 10);
			Card c37 = new Card(37 , "clubs" , "Jack", 16);
			Card c38 = new Card(38 , "clubs" , "Queen", 19);
			Card c39 = new Card(39 , "clubs" , "King", 23);
			
			Card c40 = new Card(40 , "clubs" , "Ace", 1);
			Card c41 = new Card(41 , "clubs" , "Two", 2);
			Card c42 = new Card(42 , "clubs" , "Three", 3);
			Card c43 = new Card(43 , "clubs" , "Four", 4);
			Card c44= new Card(44 , "clubs" , "Five", 5);
			Card c45 = new Card(45 , "clubs" , "Six", 6);
			Card c46 = new Card(46 , "clubs" , "Seven", 7);
			Card c47 = new Card(47 , "clubs" , "Eight", 8);
			Card c48 = new Card(48 , "clubs" , "Nine", 9);
			Card c49 = new Card(49 , "clubs" , "Ten", 10);
			Card c50 = new Card(50 , "clubs" , "Jack", 16);
			Card c51 = new Card(51 , "clubs" , "Queen", 19);
			Card c52 = new Card(52 , "clubs" , "King", 23);
			
			cardService.addCard(c1);
			cardService.addCard(c2);
			cardService.addCard(c3);
			cardService.addCard(c4);
			cardService.addCard(c5);
			cardService.addCard(c6);
			cardService.addCard(c7);
			cardService.addCard(c8);
			cardService.addCard(c9);
			cardService.addCard(c10);
			cardService.addCard(c11);
			cardService.addCard(c12);
			cardService.addCard(c13);
			cardService.addCard(c14);
			cardService.addCard(c15);
			cardService.addCard(c16);
			cardService.addCard(c17);
			cardService.addCard(c18);
			cardService.addCard(c19);
			cardService.addCard(c20);
			cardService.addCard(c21);
			cardService.addCard(c22);
			cardService.addCard(c23);
			cardService.addCard(c24);
			cardService.addCard(c25);
			cardService.addCard(c26);
			cardService.addCard(c27);
			cardService.addCard(c28);
			cardService.addCard(c29);
			cardService.addCard(c30);
			cardService.addCard(c31);
			cardService.addCard(c32);
			cardService.addCard(c33);
			cardService.addCard(c34);
			cardService.addCard(c35);
			cardService.addCard(c36);
			cardService.addCard(c37);
			cardService.addCard(c38);
			cardService.addCard(c39);
			cardService.addCard(c40);
			cardService.addCard(c41);
			cardService.addCard(c42);
			cardService.addCard(c43);
			cardService.addCard(c44);
			cardService.addCard(c45);
			cardService.addCard(c46);
			cardService.addCard(c47);
			cardService.addCard(c48);
			cardService.addCard(c49);
			cardService.addCard(c50);
			cardService.addCard(c51);
			cardService.addCard(c52);

		}
		
	}
	
	
	@GetMapping("/rest/card/getall")
	public List<Card> getAllCard(){
		
		return cardService.findAll();
	}
	
	@PostMapping("/rest/game/create")
	public Game createGame(@RequestBody Game game){
		gameService.addGame(game);
		
		return game;
		
	}
	
	@PostMapping("/rest/game/addgamedeck/{id}")
	public Deck addGameDeck(@PathVariable("id") int id, @RequestBody Deck deck ){
		
		Game game = gameService.findById(id);
		
	
		deckService.addDeck(deck);
		
		GameDeck gameDeck = new GameDeck();
		gameDeck.setDeck(deck);
		gameDeck.setGame(game);
		gameDeckService.addGameDeck(gameDeck);
		
		List<Card> listCard = new ArrayList<Card>();
		listCard = cardService.findAll();
		
		for(int i=0;i<listCard.size();i++){
			Card c = listCard.get(i);
			
			DeckCard deckCard = new  DeckCard();
			deckCard.setCard(c);
			deckCard.setDeck(deck);
			
			deckCardService.addDeckCard(deckCard);
				
		}
		
		return deck;
		
	}
	
	@PostMapping("/rest/game/addgameuser/{id}")
	public User addGameUser(@PathVariable("id") int id, @RequestBody User user ){
		
		Game game = gameService.findById(id);
		
		user.setNbReceiveCard(0);
		user.setScore(0);
		userService.addUser(user);
		
		GameUser gameUser = new GameUser();
		gameUser.setGame(game);
		gameUser.setUser(user);
		
		gameUserService.addGameUser(gameUser);
		
		return user;
		
	}
	
	
	@DeleteMapping("/rest/game/deletegameuser/{id}")
	public void deleteGameUser(@PathVariable("id") int id, @RequestBody User user){
		
		Game game = gameService.findById(id);
		
		List<GameUser> listGameUser = new ArrayList<GameUser>();
		listGameUser = gameUserService.findByGameAndUser( game, user );
		
		if(listGameUser != null && listGameUser.size()>0 ){
			GameUser  gameUser = new GameUser ();
			gameUser = listGameUser.get(0);
			
			gameUserService.deleteGameUser(gameUser);
			
			userService.deleteUser(user);
			
			/// delete usercard ---> add DeckCard
		}
		
	}
	
	
	@PutMapping("/rest/game/dealcarduser/{id}")
	public void dealCardUser(@PathVariable("id") int id, @RequestBody User user){
		
		Game game = gameService.findById(id);
	
		if(user.getNbReceiveCard() < MAX_DEAL_CARD){
			
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
				//listDeckCard.size();
				
				// melonge des card
				Collections.shuffle(listDeckCard);
				
				// Card au hasard
				Random randomGenerator = new Random();
				int index = randomGenerator.nextInt(listDeckCard.size());
				DeckCard  deckCard = listDeckCard.get(index);
				//deckCard.getIdDeckCard();
				
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
			System.out.println("MAX DEAL = " + MAX_DEAL_CARD);
		}

	}

	@GetMapping("/rest/game/getusercard/{id}")
	public List<Card> getUserCard(@PathVariable("id") int id, @RequestBody User user ){
		
		Game game = gameService.findById(id);
		
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
		
		
		return lisCard; 
		
	}
	
	
	@PutMapping("/rest/game/sortplayer/{id}")
	public List<User> shortGamePlayer(@PathVariable("id") int id ){
		
		Game game = gameService.findById(id);

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
		
		//Short List Player By Score
		  Collections.sort(listUser, User.ComparatorScore);
		
		for(int l=0;l<listUser.size();l++){
			System.out.println(listUser.get(l).getIdUser() + "  " +  listUser.get(l).getScore());

		}
		
		return listUser;
		
	}
	
	
	@GetMapping("/rest/game/getcardremaining/{id}")
	public String getCardRemaining(@PathVariable("id") int id ){
		
		Game game = gameService.findById(id);
		
		String str = "";
		
		str = gameDeckService.getCardRemainning(game);
		
		System.out.println(str);
		
		return str;

	}
	


	

}
