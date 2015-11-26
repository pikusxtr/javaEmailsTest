package com.kpi.game;

/**
 * Created by SG0213064 on 3/10/2015.
 */
public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();


        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int)(Math.random() * 10);
        System.out.println("I'm thinking a number from 0  to  10 ...");

        while(true) {
            System.out.println("Num to guess is" + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.println("Player one guessed" + guessP1);

            guessP2 = p2.number;
            System.out.println("Player two guessed" + guessP2);

            guessP3 = p3.number;
            System.out.println("Player three guessed" + guessP3);


        }

    }
}
