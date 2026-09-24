package com.blackjack;

import java.util.ArrayList;

public class UserPlayer implements Player {
    ArrayList<Integer> cards;

    public UserPlayer() {
        cards = new ArrayList<>();
    }
    @Override 
    public void addCard(int card) {
        cards.add(card);
    }

    @Override
    public Boolean hasAce() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getScore() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getNumberOfCards() {
        return cards.size();
    }
}
