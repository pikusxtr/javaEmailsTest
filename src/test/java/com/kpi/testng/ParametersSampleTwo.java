package com.kpi.testng;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by SG0213064 on 2/23/2016.
 */
public class ParametersSampleTwo {

    @Parameters({"myParam1", "myParam2"})
    @Test
    public void testName(@Optional("Default value1 used 11") String paramOne, @Optional("Default value2 used 22") String paramTwo) throws Exception {
        System.out.println("class ParametersSampleTwo");
        System.out.println("test log param1=" + paramOne);
        System.out.println("test log param2=" + paramTwo);
        Assert.assertEquals("variableAAA", "variableAAA");
    }

    @Test(expectedExceptions = { IOException.class })
    public void exceptionTestOne() throws Exception {
        throw new IOException();
    }


    @Test(expectedExceptions = { IOException.class })
    public void exceptionTestTwo() throws Exception {
        throw new ArithmeticException();
    }
}
