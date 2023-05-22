package com.java.day6;

import java.util.List;

import static com.java.day6.NQueens.solveNQueens;

public class Main {
    public static void main(String[] args) {
        int N = 4;
        List <List< String >> queen = solveNQueens(N);
        int i = 1;
        for (List < String > it: queen) {
            System.out.println("Arrangement " + i);
            for (String s: it) {
                System.out.println(s);
            }
            System.out.println();
            i += 1;
        }
    }
}
