package com.blackjack;
/*
Class for the game
*/
public class Blackjack {
    int noOfPlayers;
    CardDeck deck;

    public Blackjack(int players) {
        noOfPlayers = players;
        deck = new CardDeck();
    }

    public int getPlayers() {
        return noOfPlayers;
    }

    public CardDeck getCardDeck() {
        return deck;
    }
}
