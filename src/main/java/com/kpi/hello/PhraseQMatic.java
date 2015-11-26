package com.kpi.hello;

import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by sg0213064 on 10/19/2014.
 */
public class PhraseQMatic {
    public static void main(String[] args) {
        String[] wordOne = {"24/7", "master", "gaster", "popo", "dfdd", "eeeee", "rrrr"};
        String[] wordTwo = {"koko", "kmuo", "89898", "gygygyg"};
        String[] wordThree = {"koko33", "kmuo333", "7777", "tutut"};
        int oneLength = wordOne.length;
        int twoLength = wordTwo.length;
        int threeLength = wordThree.length;
        List<String> list01 = null;


        int rand1test = (int) (Math.random());
        for (int i = 0; i < 10; i++) {
            int rand1 = (int) (Math.random() * oneLength);
            int rand2 = (int) (Math.random() * twoLength);
            int rand3 = (int) (Math.random() * threeLength);
            int rand100 = (int) (Math.random() * 2);
            int rand101 = (int) (Math.random() * 2);
            double rand103 = (Math.random());
            double rand104 = (Math.random());
            double rand105 = (Math.random());
            rand105 = (int) rand105;

           /* System.out.println("rand1test="+ rand1test );
            System.out.println("rand1="+ rand1 );
            System.out.println("rand101="+ rand101 );
            System.out.println("rand100="+ rand100 );
            System.out.println("rand103="+ rand103 );
            System.out.println("rand104="+ rand104 );
            System.out.println("rand105="+ rand105 );*/

            String phrase = wordOne[rand1] + " " + wordTwo[rand2] + " " + wordThree[rand3];
            System.out.println("phrase = " + phrase);
            list01.add(phrase);
        }


    }
}
