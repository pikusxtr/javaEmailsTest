package com.kpi.intface;

/**
 * Created by SG0213064 on 3/21/2015.
 */
public class XYZ implements MyInterface {

    public void method1() {
        System.out.println("Implem of method 1");
    }

    public void method2() {
        System.out.println("Implem of method 2");
    }

    public void printSentence() {
        System.out.println("XYZ method");
    }

    public static void main(String[] args) {
        MyInterface obj = new XYZ();
        obj.method1();
        XYZ myXyz = new XYZ();
        myXyz.method1();
        myXyz.printSentence();
    }
}
