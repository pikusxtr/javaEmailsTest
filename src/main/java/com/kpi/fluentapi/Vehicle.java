package com.kpi.fluentapi;


import org.junit.Assert;

/**
 * Created by SG0213064 on 2/9/2016.
 */
public class Vehicle {
    private int price;
private int numberOFWheels;
    public Vehicle verifyPriceIsNotZero() {
        Assert.assertNotEquals("Price is not zero", 0, getPrice());
        return this;
    }

    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public <T extends Vehicle> T withNumberOFWheels(int numberOFWheels) {
        this.setNumberOFWheels(numberOFWheels);
        System.out.println("setting number of wheels in Vehicle Class=" + numberOFWheels);
        return (T) this;
    }

    public void setNumberOFWheels(int numberOFWheels) {
        this.numberOFWheels = numberOFWheels;
    }
}
