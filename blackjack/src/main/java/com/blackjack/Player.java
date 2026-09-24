package com.blackjack;

public interface Player {
    

    public void addCard(int card);

    public Boolean hasAce();

    public int getScore();

    public int getNumberOfCards();
}
