package com.persistance.model;
// Generated 30 d�c. 2018 16:29:22 by Hibernate Tools 3.4.0.CR1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * DeckCard generated by hbm2java
 */
@Entity
@Table(name="deck_card"
    ,catalog="logmein"
)
public class DeckCard  implements java.io.Serializable {


     private Integer idDeckCard;
     private Deck deck;
     private Card card;

    public DeckCard() {
    }

    public DeckCard(Deck deck, Card card) {
       this.deck = deck;
       this.card = card;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_deck_card", unique=true, nullable=false)
    public Integer getIdDeckCard() {
        return this.idDeckCard;
    }
    
    public void setIdDeckCard(Integer idDeckCard) {
        this.idDeckCard = idDeckCard;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_deck", nullable=false)
    public Deck getDeck() {
        return this.deck;
    }
    
    public void setDeck(Deck deck) {
        this.deck = deck;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_card", nullable=false)
    public Card getCard() {
        return this.card;
    }
    
    public void setCard(Card card) {
        this.card = card;
    }




}

