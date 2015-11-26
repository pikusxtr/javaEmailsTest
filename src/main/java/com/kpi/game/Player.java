package com.kpi.game;

/**
 * Created by SG0213064 on 3/10/2015.
 */
public class Player {
    int number = 0;

    public void guess() {
        number = (int)(Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
