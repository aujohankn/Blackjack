package com.blackjack;
import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {
    ArrayList<Integer> cards = new ArrayList<>();

    public CardDeck() {
        // start with all cards in deck
        for (int i = 1; i <= 52; i++) {
            cards.add(i);
        }
        // initial shuffle
        Collections.shuffle(cards);
    }

    public int drawCard() {
        int drawnCard = cards.get(0);
        cards.remove(0);
        return drawnCard;
    }

    public int getSize() {
        return cards.size();
    }

    public void shuffleCards() {
        Collections.shuffle(cards);
    }
}
