package com.kpi.extended;

/**
 * Created by sg0213064 on 4/10/2015.
 */
public class Y extends X {
    String yCustomName;
    public Y() {
        this.yCustomName = "Y custom initialized";
        System.out.println("Y class Constructor!!!");
    }

    public void methodA(){
        System.out.println("I am method A - Class Y");
    }
}
