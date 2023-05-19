package com.java.day5;

import java.util.Random;

public class Dice {
    public int rollDice() {
        int n = 0;
        Random r = new Random();
        n = r.nextInt(7);
        if(n==0){
            return 1;
        }
        return n;
    }
}
