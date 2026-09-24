package com.blackjack;

public class PlayerInputHandler {
    String userInput;
    BlackjackGame game;

    public PlayerInputHandler(BlackjackGame blackjack) {
        game = blackjack;
    }

    public void handleInput(String in) {
        userInput = in;
        switch (userInput) {
            case "hit" -> {
                game.drawCardStep();
            }
            case "stay" -> {
                game.setGameState(2);
            }
            default -> {
                System.out.println("Forkert input, lukker ned");
            }
        }
    }
}
        
