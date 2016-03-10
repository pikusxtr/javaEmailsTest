package com.kpi.fluentapi;

import com.kpi.fluentapi.*;
/**
 * Created by SG0213064 on 2/9/2016.
 */
public class CarTest {

    public static void main(String[] args) {
        Car porsche = new Car();
        porsche.setNumberOfSeats(55);
        porsche.verifyNumberOfSeatsIsNotZero();
        porsche
                .<Car>withNumberOFWheels(55)
                .verifyNumberOfSeatsIsNotZero();

        porsche
                .verifyNumberOfSeatsIsNotZero()
                .<Car>withNumberOFWheels(55);
       // porsche.setNumberOfSeats(44);
       // porsche.<Car>withNumberOFWheels(3).verifyNumberOfSeatsIsNotZero();
    }
}
