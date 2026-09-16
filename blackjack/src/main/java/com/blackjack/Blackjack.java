package com.blackjack;

import java.util.ArrayList;

/*
Class for the game
*/
public class Blackjack {
    int noOfPlayers;
    CardDeck deck;
    int playerTurn;
    ArrayList<ArrayList<Integer>> playersCards;

    public Blackjack(int players) {
        noOfPlayers = players;
        deck = new CardDeck();
        playerTurn = 1;
        playersCards = new ArrayList<>();
        playersCards.add(new ArrayList<>()); //dealers hand
        playersCards.add(new ArrayList<>()); //player 1s hand
    }

    public int getPlayers() {
        return noOfPlayers;
    }

    public int getPlayerTurn() {
        return playerTurn;
    }

    public CardDeck getCardDeck() {
        return deck;
    }

    public void giveCardToPlayer(int card, int player) {
        playersCards.get(player).add(card);
    }

    public int getPlayerScore(int player) {
        int result = 0;
        ArrayList<Integer> cards = playersCards.get(player);
        
        for (Integer card : cards) {
            result = result + getCardValue(card);
        }
        return result;
    }

    public int getCardValue(int cardId) {
        int face = cardId % 13;
        if (face < 10) {
            return face + 1;
        } else return 10;
    }

    public String cardIdToString(int cardId) {
        String result = "";
        int face = cardId % 13;
        int suit = (int)Math.floor(cardId/13);

        switch (face) {
            case 0:
                result = "Ace";
                break;
            case 1:
                result = "Two";
                break;
            case 2:
                result = "Three";
                break;
            case 3:
                result = "Four";
                break;
            case 4:
                result = "Five";
                break;
            case 5:
                result = "Six";
                break;
            case 6:
                result = "Seven";
                break;
            case 7:
                result = "Eight";
                break;
            case 8:
                result = "Nine";
                break;
            case 9:
                result = "Ten";
                break;
            case 10:
                result = "Jack";
                break;
            case 11:
                result = "Queen";
                break;
            case 12:
                result = "King";
                break;
            default:
                break;
        }
        
        switch (suit) {
            case 0:
                result = result + " of Hearts";
                break;
            case 1:
                result = result +" of Diamonds";
                break;
            case 2:
                result = result +" of Spades";
                break;
            case 3:
                result = result +" of Clubs";
                break;
            default:
                break;
        }
        return result;
    }
}
