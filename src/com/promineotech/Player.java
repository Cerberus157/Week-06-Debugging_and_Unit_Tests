package com.promineotech;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand; // Field to store the list of cards in the player's hand
    private int score; // Field to store the player's score
    private String name; // Field to store the player's name
    
    //Constructor
    //Initialize the player with a name, an empty hand, and a score of 0
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }
    
    //Methods
    //Print out information about the player and their hand
    public void describe() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {
        return hand.remove(0); //(remove and return) the top card of the player's hand
    }

    public void draw(Deck deck) {
        hand.add(deck.draw()); //Draw a card from the deck and add it to the player's hand
    }

    public void incrementScore() {
        score++; //Increment the player's score by 1
    }
    
    //Getters and Setters
	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}
    
}
