package com.kpi.hello;

/**
 * Created by sg0213064 on 10/18/2014.
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("hi Kris master");
        int x=2;
        int y=4;
        if((x==2) && (y==5)){
            System.out.println("IF passed");
        } else {
            System.out.println("ELSE Passed");
        }

        while (y>1){
            System.out.println("still in awhile" + y);
            y=y-1;
        }
    }
}
