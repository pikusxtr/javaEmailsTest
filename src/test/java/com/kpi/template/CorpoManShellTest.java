package com.kpi.template;

/**
 * Created by SG0213064 on 3/18/2015.
 */
public class CorpoManShellTest {


    public static void main(String[] args) {
        System.out.println("Class count ShellMan Initial=" + CorpoShellMan.classCount);
        CorpoShellMan corpoShellMan1 = (CorpoShellMan) new CorpoShellMan().withFirstName("Kris");

        System.out.println("Class count ShellMan AFTER 1=" + CorpoShellMan.classCount);
        CorpoShellMan corpoShellMan2 = corpoShellMan1;
        corpoShellMan2.fuelAmount = 458;
        System.out.println("Class count ShellMan AFTER 2=" + CorpoShellMan.classCount);
        System.out.println("shellMan2 fuel=" + corpoShellMan2.fuelAmount);
        System.out.println("shellMan1 fuel=" + corpoShellMan1.fuelAmount);
        int x=10;
        byte b=127;
    }
}
