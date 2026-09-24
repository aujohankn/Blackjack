package com.blackjack;

public class Utils {
    public static int getCardValue(int cardId) {
        int face = cardId % 13;
        if (face < 10) {
            return face + 1;
        } else return 10;
    }

    public static String cardIdToString(int cardId) {
        String result;
        int face = cardId % 13;
        int suit = (int)Math.floor(cardId/13);

        switch (face) {
            case 0 -> result = "Ace";
            case 1 -> result = "Two";
            case 2 -> result = "Three";
            case 3 -> result = "Four";
            case 4 -> result = "Five";
            case 5 -> result = "Six";
            case 6 -> result = "Seven";
            case 7 -> result = "Eight";
            case 8 -> result = "Nine";
            case 9 -> result = "Ten";
            case 10 -> result = "Jack";
            case 11 -> result = "Queen";
            case 12 -> result = "King";
            default -> result = "ERROR";
        }
        
        switch (suit) {
            case 0 -> result = result + " of Hearts";
            case 1 -> result = result +" of Diamonds";
            case 2 -> result = result +" of Spades";
            case 3 -> result = result +" of Clubs";
            default -> result = result + "ERROR";
        }
        return result;
    }
}
