package com.kpi.intface.print;

/**
 * Created by SG0213064 on 3/27/2015.
 */
public class A7Page implements Printable,Showable {
    public void print(){
        System.out.println("Hello in A7Class");
    }
    public void print(String printMeeee){
        System.out.println(printMeeee);
    }
    public void show(){
        System.out.println("Show in A7Class");
    }

    public static void main(String[] args) {
        A7Page a7Page = new A7Page();
        a7Page.print();
        a7Page.show();
        a7Page.print("prinME aaaaaa");
    }
}
