package com.blackjack;

public class ZombieCode {
                    // System.out.println("Spiller 1 trækker " + Utils.cardIdToString(drawnCard));
                // table.giveCardToPlayer(drawnCard, 1);
                // System.out.println("Nuværende værdi: " + table.getPlayerScore(getPlayerTurn()));
                // if (table.getPlayerScore(getPlayerTurn()) > 21) {
                //     System.out.println("BUSTED!");
                //     gameContinue = false;
                // }
}
        // while(keepPlaying) {
        //     deck = new CardDeck();

        //     keepPlaying = playHand();
        //     System.out.println("Spil videre? Skriv 'JA' eller 'NEJ'");
        //     userInput = gameUI.getInput();
        //     switch (userInput) {
        //         case "JA"-> keepPlaying = true;
        //         case "NEJ"-> keepPlaying = false;
        //         default -> throw new AssertionError();
        //     }
        // }
        // public void startGame() {
    //     String userInput;
    //     System.out.println("Hej, jeg er et spil blackjack");

    //     //System.out.println("Jeg er dealer og der er " + getPlayers() + " spillere. Tokens:" + playerTokens);

    //     boolean keepPlaying = true;
        
    //     while(keepPlaying) {
    //         deck = new CardDeck();

    //         keepPlaying = game.playHand();
    //         System.out.println("Spil videre? Skriv 'JA' eller 'NEJ'");
    //         userInput = scanner.nextLine();
    //         switch (userInput) {
    //             case "JA"-> keepPlaying = true;
    //             case "NEJ"-> keepPlaying = false;
    //             default -> throw new AssertionError();
    //         }
    //     }
    //     scanner.close();
    // }

    // public void handLoop() {
    //     String userInput;
    //     //while true indtil spil er slut
    //     Boolean gameContinue = true;
    //     while(gameContinue) {
    //         System.out.println("Spiller " + game.getPlayerTurn() + "'s tur.");
    //         System.out.println("Nuværende værdi: " + table.getPlayerScore(getPlayerTurn()));
    //         System.out.println("Skriv 'hit' eller 'stay' i input feltet");
    //         userInput = scanner.nextLine();
    //         if ("".equals(userInput)) userInput = scanner.nextLine();
    //         System.out.println(userInput);
    //         switch (userInput) {
    //             case "hit" -> {
    //                 drawnCard = deck.drawCard();
    //                 System.out.println("Spiller 1 trækker " + Utils.cardIdToString(drawnCard));
    //                 table.giveCardToPlayer(drawnCard, 1);
    //                 System.out.println("Nuværende værdi: " + table.getPlayerScore(getPlayerTurn()));
    //                 if (table.getPlayerScore(getPlayerTurn()) > 21) {
    //                     System.out.println("BUSTED!");
    //                     gameContinue = false;
    //                 }
    //             }
    //             case "stay" -> {
    //                 System.out.println("Dealers hånd værdi: " + table.getPlayerScore(0));
    //                 while(table.getPlayerScore(0) < 17) {
    //                     drawnCard = deck.drawCard();
    //                     System.out.println("Dealer trækker " + Utils.cardIdToString(drawnCard));
    //                     table.giveCardToPlayer(drawnCard, 0);
    //                     System.out.println("Dealers hånd værdi: " + table.getPlayerScore(0));
    //                 }
    //                 gameContinue = false;
    //             }
    //             case "quit" -> {
    //                 System.out.println("Lukker ned");
    //                 return false;
    //             }
    //             case "" -> {

    //             }
    //             default -> {
    //                 System.out.println("Forkert input, lukker ned");
    //                 gameContinue = false;
    //             }
    //         }
            
    //     }
    //     var dealerscore = table.getPlayerScore(0);
    //     var playerscore = table.getPlayerScore(1);
    //     if (dealerscore < playerscore) {
    //         System.out.println("Spiller 1 vinder!");
    //     } else if (dealerscore > playerscore) {
    //         System.out.println("Dealeren vinder!");
    //     } else {
    //         System.out.println("Push!");
    //     }
    // }