package com.blackjack;

import java.util.ArrayList;

public class GameBoard {
    ArrayList<ArrayList<Integer>> playersCards;
    
    public GameBoard(int noOfPlayers) {
        playersCards = new ArrayList<>();
        playersCards.add(new ArrayList<>()); //dealers hand
        for (int i = 0; i < noOfPlayers; i++) {
            playersCards.add(new ArrayList<>()); //player i's hand
        }
    }

    public void giveCardToPlayer(int card, int player) {
        playersCards.get(player).add(card);
    }

    public int getPlayerScore(int player) {
        int result = 0;
        ArrayList<Integer> cards = playersCards.get(player);
        
        for (Integer card : cards) {
            result = result + Utils.getCardValue(card);
        }
        return result;
    }
    
}
