package com.kpi.mytrials;

import org.apache.commons.lang.StringUtils;

/**
 * Created by sg0213064 on 11/24/2015.
 */
public class TestKpi {
    public static void myprint(String text){
        System.out.println(text);
    }

    public static void main(String[] args) {
       String maskedText= StringUtils.repeat("\u2022", 12);
         String creditCardNumberSample = "1234567890129999";
        myprint("Last 4 card numbers=" + creditCardNumberSample.substring(creditCardNumberSample.length()-4));
        myprint("all masked numbers="+maskedText + creditCardNumberSample.substring(creditCardNumberSample.length()-4));




    }

}
