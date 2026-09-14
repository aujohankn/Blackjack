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
}
