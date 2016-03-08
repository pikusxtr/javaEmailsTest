package com.kpi.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by SG0213064 on 1/25/2016.
 */
public class StreamTest {

    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        List<String> cars2 = new ArrayList<>();
        cars.add("BMW X1");
        cars.add("BMW X5");
        cars.add("BMW X6 M");
        cars.add("Porsche 911");
        cars.add("Porsche Cayenne");
        System.out.println("car01=" + cars.get(0));
        System.out.println("car02=" + cars.get(1));
        System.out.println("car03=" + cars.get(2));
        Stream<String> carStream =  cars.stream()
                .filter(str -> str.contains("Porsche"))
                .map(filteredElement -> filteredElement+"__SUFFIX_XTR");
        cars = carStream.collect(Collectors.toList());
        System.out.println("car01=" + cars.get(0));
        System.out.println("car02=" + cars.get(1));
       cars2= cars.stream()
                .filter(str -> str.contains("Porsche")).collect(Collectors.toList());
        System.out.println("INT STREAMMMM ");
        List<String> myRangeFromStream = new ArrayList<>();
        List<Integer> intStreamKpi = new ArrayList<>();
        myRangeFromStream.add("0DDD");
        myRangeFromStream.add("1DDD");
        myRangeFromStream.add("2DDD");
        myRangeFromStream.add("3DDD");
        myRangeFromStream.add("4DDD");
        myRangeFromStream.add("5DDD");
        String result = IntStream.range(0, 6).filter(value -> {
            return myRangeFromStream.get(value).equals("2DDD");
        }).mapToObj(value -> myRangeFromStream.get(value)).collect(Collectors.toList()).get(0);

        int resultInt = IntStream.range(0, 6).filter(value -> {
            return myRangeFromStream.get(value).equals("2DDD");
        }).mapToObj(value -> value).collect(Collectors.toList()).get(0);

        System.out.println("my result String=" + result);
        System.out.println("my result INT=" + resultInt);
    }
}
