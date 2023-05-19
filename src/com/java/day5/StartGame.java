package com.java.day5;

import java.util.Scanner;

public class StartGame {

    Dice dice = new Dice();
    Board snake = new Board();
    public void startGame() {
        int player1Position=0, player2Position=0;
        int currentPlayer=-1;
        Scanner scan= new Scanner(System.in);
        String rPressed;
        int diceValue = 0;
        do {
            System.out.println(currentPlayer == -1
                    ? "\n\nFirst player's turn" : "\n\nSecond player's turn");
            System.out.println("Press 'r' to roll Dice");
            rPressed=scan.next();
            diceValue=dice.rollDice();

            if (currentPlayer==-1) {
                player1Position=snake.calculatePlayerValue(player1Position, diceValue);
                System.out.println("First Player Position:"+player1Position);
                System.out.println("Second Player Position:"+player2Position);
                System.out.println("-------------------------");
                if (snake.isWin(player1Position)) {
                    System.out.println("Congratulations! First player won");
                    return;
                }
            } else {
                player2Position = snake.calculatePlayerValue(player2Position, diceValue);
                System.out.println("First Player Position:"+player1Position);
                System.out.println("Second Player Position:"+player2Position);
                System.out.println("-------------------------");
                if (snake.isWin(player2Position)) {
                    System.out.println("Congratulations! Second player won");
                    return;
                }
            }
            currentPlayer = -currentPlayer;
        } while ("r".equals(rPressed));
    }
}
