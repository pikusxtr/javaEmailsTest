package com.kpi.codility;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class BinaryGap {



    public static int solution(int N) {
        System.out.println("Binary value of "+ N + " = " + Integer.toBinaryString(N));
        int result=0;
        if(N > 0) {
            List<Integer> zeroesList  = new ArrayList<>();
            Pattern myPattern = Pattern.compile("(10+1)");
            Matcher myMatcher = myPattern.matcher(Integer.toBinaryString(N));
            boolean found = myMatcher.find();
            while (found) {
                zeroesList.add(myMatcher.group().toString().replace("1", "").length());
                found = myMatcher.find(myMatcher.start() + 1);
            }
            if(zeroesList.size() > 0) {
                result = zeroesList.stream().max(Integer::compareTo).get();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("BinaryGap for 1041=" +solution(1041) );
        System.out.println("BinaryGap for 15=" +solution(15) );
        System.out.println("BinaryGap for 15666=" +solution(15666) );
    }
}