package com.kpi.fluentapi;

import org.junit.Assert;

/**
 * Created by SG0213064 on 2/9/2016.
 */
public class Car extends Vehicle {
    private int numberOfSeats;


    public Car verifyNumberOfSeatsIsNotZero() {
        Assert.assertNotEquals("Number of seats is not zero", 0, getNumberOfSeats());
        return this;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
