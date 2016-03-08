package com.kpi.dates;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Random;

/**
 * Created by SG0213064 on 3/7/2016.
 */
public class DateFormattingTest {
    public static void main(String[] args) {
        String myDateFormat = "HHmmss";
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern(myDateFormat);
        String randomSuffix = String.valueOf(Math.abs(new Random().nextInt())).substring(0, 3);
        System.out.println("my random number=" + randomSuffix);
        //System.out.println("get current time=" + LocalDate.now().format(myFormatter));
    }
}
