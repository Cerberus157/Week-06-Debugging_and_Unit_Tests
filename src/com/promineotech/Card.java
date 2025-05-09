package com.promineotech;

public class Card {
	private int value; // Field to store the value of the card (2-14 representing cards 2-Ace)
    private String name; // Field to store the name of the card (e.g., Ace of Diamonds, Two of Hearts)
    
    //Constructor
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }
    
    //Getters and Setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //Methods
    //Print out information about the card
    public void describe() {
        System.out.println(name + " (Value: " + value + ")");
    }
}
