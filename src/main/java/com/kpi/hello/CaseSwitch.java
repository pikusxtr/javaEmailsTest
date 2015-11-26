package com.kpi.hello;

/**
 * Created by SG0213064 on 3/5/2015.
 */
public class CaseSwitch {
    public static void main(String[] args) {
        char grade = 'B';

        switch(grade)
        {
            case 'A' :
                System.out.println("Excellent!");
                break;
            case 'B' :
                System.out.println("ChooseB");
                System.out.println("ChooseBBBB");

            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");

        }
        System.out.println("Your grade is " + grade);
    }
}
