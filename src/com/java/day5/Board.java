package com.java.day5;
import java.util.HashMap;
import java.util.Map;

public class Board {

    final static int WINPOINT = 100;
    static Map<Integer, Integer> snake = new HashMap<>();
    static Map<Integer, Integer> ladder = new HashMap<>();

    static{
        snake.put(99, 54);
        snake.put(70, 55);
        snake.put(52, 42);
        snake.put(25, 2);
        snake.put(95, 72);

        ladder.put(6, 25);
        ladder.put(11, 40);
        ladder.put(60, 85);
        ladder.put(46, 90);
        ladder.put(17, 69);
    }
    public int calculatePlayerValue(int playerPosition, int diceValue) {
        int playerNewPosition=playerPosition+diceValue;

        if (playerNewPosition > WINPOINT)
            return playerPosition;

        if (null !=snake.get(playerNewPosition)) {
            System.out.println("snake attack");
            playerNewPosition=snake.get(playerNewPosition);
        }

        if (null !=ladder.get(playerNewPosition)) {
            System.out.println("climbing ladder");
            playerNewPosition=ladder.get(playerNewPosition);
        }

        return playerNewPosition;
    }

    public boolean isWin(int playerPosition) {
        return WINPOINT==playerPosition;
    }

}