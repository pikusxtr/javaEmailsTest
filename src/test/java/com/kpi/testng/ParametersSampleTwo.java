package com.kpi.testng;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

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
}
