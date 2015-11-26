package com.kpi.extended;

/**
 * Created by sg0213064 on 4/10/2015.
 */
public class Z {
    public static void main(String[] args) {
        System.out.println("Before Obj1 creation");
        X obj1 = new X();
        System.out.println("Before Obj2 creation");
        X obj2 = new Y();
        System.out.println("Before Obj3 creation");
        X obj3 = new Y1();
        obj1.methodA();
        obj2.methodA();
        System.out.println("Obj 3:");
        obj3.methodA();

        System.out.println("Obj 4:");
        Y obj4y = new Y();
        System.out.println("Obj1 name= " + obj1.name);
        System.out.println("Obj2 name= " + obj2.name);
        System.out.println("Obj3 name= " + obj3.name);
        System.out.println("Obj4 custom name= " + obj4y.yCustomName);
        System.out.println("Obj4 name= " + obj4y.name);
    }
}
