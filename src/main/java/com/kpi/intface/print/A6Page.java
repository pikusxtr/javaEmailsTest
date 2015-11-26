package com.kpi.intface.print;

/**
 * Created by SG0213064 on 3/27/2015.
 */
public class A6Page implements Printable {
    public void print(String mee){
        System.out.println("Hello in A6Class" + mee);
    }

    public static void main(String[] args) {
        A6Page a6Page = new A6Page();
        a6Page.print("popopo");
    }
}
