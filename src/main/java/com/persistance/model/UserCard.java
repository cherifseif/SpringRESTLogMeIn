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
 * UserCard generated by hbm2java
 */
@Entity
@Table(name="user_card"
    ,catalog="logmein"
)
public class UserCard  implements java.io.Serializable {


     private Integer idUserCard;
     private Card card;
     private User user;

    public UserCard() {
    }

    public UserCard(Card card, User user) {
       this.card = card;
       this.user = user;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_user_card", unique=true, nullable=false)
    public Integer getIdUserCard() {
        return this.idUserCard;
    }
    
    public void setIdUserCard(Integer idUserCard) {
        this.idUserCard = idUserCard;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_card", nullable=false)
    public Card getCard() {
        return this.card;
    }
    
    public void setCard(Card card) {
        this.card = card;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_user", nullable=false)
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }




}


