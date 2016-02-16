package com.kpi.hello;

/**
 * Created by SG0213064 on 3/5/2015.
 */
public class CaseSwitchWithEmpty {
    public static void main(String[] args) {
        char grade = 'A';

        switch(grade)
        {
            case 'A' :
            case 'B' :
                System.out.println("ChooseB");
                System.out.println("ChooseBBBB");
                break;
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
                break;
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Default switch executed");

        }
        System.out.println("Your grade is " + grade);
    }
}
