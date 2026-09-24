package com.blackjack;

import java.util.Scanner;

public class TerminalGameUI implements GameUI {

    Scanner scanner;
    String userInput;

    public TerminalGameUI() {
        scanner = new Scanner(System.in);
    }

    @Override
    public String getInput() {
        userInput = scanner.nextLine();
        if ("".equals(userInput)) userInput = scanner.nextLine();
        return userInput;
    }
    
}
