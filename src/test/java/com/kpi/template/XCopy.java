package com.kpi.template;

/**
 * Created by SG0213064 on 3/20/2015.
 */
public class XCopy {
    public static void main(String[] args) {
        int orig=66;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + "* 2=" +" " +y);
    }

    int go(int arg){
        arg=arg*2;
        return arg;
    }
}
