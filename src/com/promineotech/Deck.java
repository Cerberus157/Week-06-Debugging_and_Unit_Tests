package com.promineotech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards; // Field to store the list of cards in the deck
	
	//Constructor
	//Initialize the deck with 52 standard cards
    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"}; // Array of suits
        String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"}; // Array of card names
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < names.length; j++) {
                cards.add(new Card(j + 2, names[j] + " of " + suits[i])); // Create a new card and add it to the deck
            }
        }
    }
    
    //Methods
    public void shuffle() {
        Collections.shuffle(cards); // Randomize the order of the cards
    }

    public Card draw() {
        return cards.remove(0); // Remove and return the top card
    }
}
