package com.java;

import java.util.Random;

public class Dice {

    private int rolledSide;

    public Dice() {
        rollDice();
    }

    public void rollDice() {
        Random rand = new Random();
        rolledSide = rand.nextInt(6) + 1;
    }

    public int getRolledSide() {
        return rolledSide;
    }
}
