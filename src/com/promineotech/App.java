package com.promineotech;

public class App {

    public static void main(String[] args) {
        Deck deck = new Deck(); // Create a new deck of cards
        deck.shuffle(); // Shuffle the deck

        // Create two players
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Distribute the cards to the players
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck); // Player 1 draws a card
            } else {
                player2.draw(deck); // Player 2 draws a card
            }
        }
        
        // Each player flips a card and compares values
        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip(); // Player 1 flips a card
            Card card2 = player2.flip(); // Player 2 flips a card

            card1.describe(); // Describe Player 1's card
            card2.describe(); // Describe Player 2's card

            // Compare the values of the flipped cards
            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore(); // Increment Player 1's score
                System.out.println(player1.getName() + " wins this round.");
            } else if (card2.getValue() > card1.getValue()) {
                player2.incrementScore(); // Increment Player 2's score
                System.out.println(player2.getName() + " wins this round.");
            } else {
                System.out.println("It's a draw.");
            }

            // Print the current scores
            System.out.println(player1.getName() + " score: " + player1.getScore());
            System.out.println(player2.getName() + " score: " + player2.getScore());
        }

        // Print the final scores
        System.out.println("Final Scores:");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

        // Determine and print the winner
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }

    } // End of Main

} // End of App Class
