package com.kpi.hello;

/**
 * Created by SG0213064 on 1/27/2016.
 */
public class StringOperations {
    public static void main(String[] args) {
        String checkCaseSensit = "KPIpopo";
        System.out.println("Contains KPI=" + checkCaseSensit.contains("KPI"));
        System.out.println("Contains lowercase kpi=" + checkCaseSensit.contains("kpi"));
    }
}
