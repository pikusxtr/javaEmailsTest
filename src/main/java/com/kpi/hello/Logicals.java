package com.kpi.hello;

/**
 * Created by SG0213064 on 3/4/2015.
 */
public class Logicals {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        int c=9;
        int d=8;
        int e;
        if ((a < b) && (c < d)){
            System.out.println("IF OK");
        }else if (!(a < b) && !(c < d) ){
            System.out.println("ELSE IF OK");
        }else {
            System.out.println("ELSE OK");
        }

        e = (a >=b) ? 10:20;
        System.out.println("E="+e);

        int f = (a !=b) ? 10:20;
        System.out.println("F=" + f);
    }
}
