package com.blackjack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Blackjack game = new Blackjack(1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hej jeg er et spil blackjack.");
        System.out.println("Jeg er dealer og der er " + game.getPlayers() + " spillere.");

        int tempCard = 0;

        tempCard = game.deck.drawCard();
        System.out.println("Spiller 1 trækker " + game.cardIdToString(tempCard));
        game.giveCardToPlayer(tempCard, 1);

        tempCard = game.deck.drawCard();
        System.out.println("Dealer trækker skjult kort");
        game.giveCardToPlayer(tempCard, 0);

        tempCard = game.deck.drawCard();
        System.out.println("Spiller 1 trækker " + game.cardIdToString(tempCard));
        game.giveCardToPlayer(tempCard, 1);

        tempCard = game.deck.drawCard();
        System.out.println("Dealer trækker " + game.cardIdToString(tempCard));
        game.giveCardToPlayer(tempCard, 0);

        //while true indtil spil er slut
        Boolean gameContinue = true;
        while(gameContinue) {
            System.out.println("Spiller " + game.getPlayerTurn() + "'s tur.");
            System.out.println("Nuværende værdi: " + game.getPlayerScore(game.getPlayerTurn()));
            System.out.println("Skriv 'hit' eller 'stay' i input feltet");
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "hit":
                    tempCard = game.deck.drawCard();
                    System.out.println("Spiller 1 trækker " + game.cardIdToString(tempCard));
                    game.giveCardToPlayer(tempCard, 1);
                    System.out.println("Nuværende værdi: " + game.getPlayerScore(game.getPlayerTurn()));
                    if (game.getPlayerScore(game.getPlayerTurn()) > 21) {
                        System.out.println("BUSTET!");
                        gameContinue = false;
                    }
                    break;
                case "stay":
                    System.out.println("Dealers hånd værdi: " + game.getPlayerScore(0));
                    while(game.getPlayerScore(0) < 17) {
                        tempCard = game.deck.drawCard();
                        System.out.println("Dealer trækker " + game.cardIdToString(tempCard));
                        game.giveCardToPlayer(tempCard, 0);
                        System.out.println("Dealers hånd værdi: " + game.getPlayerScore(0));
                    }
                    if (game.getPlayerScore(0) < game.getPlayerScore(1)) {
                        System.out.println("Spiller 1 vinder!");
                    } else if (game.getPlayerScore(0) > game.getPlayerScore(1)) {
                        System.out.println("Dealeren vinder!");
                    }
                    gameContinue = false;
                    
                    break;
                case "quit":
                    System.out.println("Lukker ned");
                    break;
                default:
                    System.out.println("Forkert input, lukker ned");
                    gameContinue = false;
                    break;
            }
        }
        
        scanner.close();
        //launch(args);
    }
}