package com.java;

public class Main {

    public static void main(String[] args) {
	    Dice d = new Dice();


	    for (int i = 0; i <= 1; i++) {
            d.rollDice();
            System.out.println("You have rolled: " + d.getRolledSide());
        }
    }
}
