package com.kpi.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by SG0213064 on 1/25/2016.
 */
public class StreamTest {

    public static void main(String[] args) {
        List<String> cars = new ArrayList<String>();
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
    }
}
