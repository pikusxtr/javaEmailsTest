package com.kpi.hello;

/**
 * Created by SG0213064 on 3/4/2015.
 */
public class ElvisExpr {
    public static void main(String[] args) {
        int a , b;
        a = 10;
        b = (a == 1) ? 20: 30;
        b= (a==2) ? 30 :40;
        System.out.println("valuer of A=" + a);
        System.out.println( "Value of b for a1 condition is : " +  b );

        b = (a == 10) ? 20: 30;
        System.out.println( "Value of b for a10 condition is : " + b );




        String testVar01 = "Maciek";
        String result = (testVar01 == "Maciek") ? "Imie OK":"Imie failed";
        System.out.println("valuer of result=" + result);

         result = (testVar01 == "Krzysiek") ? "Imie OK":"Imie failed";
        System.out.println("valuer of result=" + result);

        String result02 = (testVar01=="ZLA WARTOSC") ?"20":"30";
        String result333 = (false) ? "aaa":"niiiieeeeee";
        System.out.println("result333="+ result333);
    }
}
