package com.blackjack;

import java.util.ArrayList;

/*
Class for the game
*/
public class BlackjackGame {
    int noOfPlayers;
    CardDeck deck;
    int playerTurn;
    ArrayList<Player> players;
    int gameState = 0;
    
    String userInput;

    GameUI gameUI;

    PlayerInputHandler inputHandler;

    public BlackjackGame(int noOfUserPlayers) {
        noOfPlayers = noOfUserPlayers;
        deck = new CardDeck();
        playerTurn = 1; //player 1 is the first to recieve a card
        players = new ArrayList<>();
        gameState = 0;

        players.add(new Dealer());
        for (int i = 0; i < noOfPlayers; i++) {
            players.add(new UserPlayer());
        }
        
        gameUI = new TerminalGameUI();

        inputHandler = new PlayerInputHandler(this);
    }

    public void startGame() {
        System.out.println("Hej jeg er et spil blackjack.");

        System.out.println("Jeg er dealer og der er " + getPlayers() + " spillere.");

        // Give all players 2 cards
        while(players.get(0).getNumberOfCards() < 2) {
            drawCardStep();
            nextPlayerTurn();
        }
        gameState = 1;
        gameLoop();
    }

    private void gameLoop() {
        while(gameState==1) {
            userInput = gameUI.getInput();
            inputHandler.handleInput(userInput);
        }
        if (gameState == 2) {
            // Showdown
            var dealerscore = getPlayerScore(0);
            var playerscore = getPlayerScore(1);

            if (dealerscore < playerscore) {
                System.out.println("Spiller 1 vinder!");
            } else if (dealerscore > playerscore) {
                System.out.println("Dealeren vinder!");
            } else {
                System.out.println("Push!");
            }
        }
    }

    public int drawCardStep() {
        int drawnCard;
        String cardString;

        drawnCard = deck.drawCard();
        cardString = Utils.cardIdToString(drawnCard);
        players.get(playerTurn).addCard(drawnCard);
        if (playerTurn == 0) {
            System.out.println("Dealeren trækker " + cardString);
        } else {
            System.out.println("Spiller " + playerTurn + " trækker " + cardString);
        }
        return drawnCard;
    }

    public void nextPlayerTurn() {
        playerTurn += 1;
        if (playerTurn > noOfPlayers) {
            playerTurn = 0;
        }
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

    public int getPlayerScore(int player) {
        return players.get(player).getScore();
    }

    public void setGameState(int newGameState) {
        gameState = newGameState;
    }

    public void evaluateHand() {
        
    }
}

