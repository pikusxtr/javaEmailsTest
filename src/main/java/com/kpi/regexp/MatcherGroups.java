package com.kpi.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by SG0213064 on 3/17/2015.
 */
public class MatcherGroups {

    public static void main( String args[] ){

        // String to be scanned to find the pattern.
        String line = "This order was pplaced for QT3000! OK?";
        String line2 = "This order was pplaced This for kpi+_kokoRS QT3000! OK?";
        String line3 = "region_match";
       // line3.compareTo()

        // String pattern = "(\\d+)(!.*OK.+)";
       String pattern = "(This.{3})";
        String pattern2 = "([a-zA-Z_+]{5,30}RS)";
        String pattern3 = "(region_.+)";


        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);
        Pattern r2 = Pattern.compile(pattern2);
        Pattern r3 = Pattern.compile(pattern3);


        Pattern pattern1 = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        Matcher m2 = pattern1.matcher(line2);
        Matcher m3 = r2.matcher(line2);
        Matcher m4 = r3.matcher(line3);

        System.out.println("Matcher groups=" + m.groupCount());
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
        //    System.out.println("Found value: " + m.group(2) );

            //System.out.println("Found value: " + m.group(2) );
        } else {
            System.out.println("NO MATCH");
        }


        while(m2.find()){
            System.out.println("M2 - Found value: " + m2.group(0) );
            System.out.println("M2 position start"+ m2.start());
            System.out.println("M2 position end"+ m2.end());
            System.out.println("M2 Region start"+ m2.regionStart());
            System.out.println("M2 Region end"+ m2.regionEnd());
            //System.out.println("m2.matches()=" +m2.matches() );

        }
        System.out.println("m2.reset() result=" + m2.reset().find() );


        if(m4.matches()){
            System.out.println("--------------matched true");
            System.out.println("M4 matches reuslt=" + m4.matches());
        }


        if (m3.find( )) {
            System.out.println("M3 Found value: " + m3.group(0) );
            System.out.println("M3 Found value: " + m3.group(1) );
            //    System.out.println("Found value: " + m.group(2) );

            //System.out.println("Found value: " + m.group(2) );
        } else {
            System.out.println("NO MATCH");
        }

    }
}
