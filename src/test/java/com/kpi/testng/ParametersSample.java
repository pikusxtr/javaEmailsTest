package com.kpi.testng;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by SG0213064 on 2/23/2016.
 */
public class ParametersSample{

    @Parameters({"myParam1", "myParam2", "birthYear"})
    @Test
    public void testName(@Optional("Default value1 used 11") String paramOne, @Optional("Default value2 used 22") String paramTwo, int birthYear, ITestContext context) throws Exception {
        System.out.println("class ParametersSampleOne");
        System.out.println("test log param1=" + paramOne);
        System.out.println("test log param2=" + paramTwo);
        System.out.println("test log birthYear=" + birthYear);
        System.out.println("text context ITestContext getName=" + context.getName());
        System.out.println("text context ITestContext getHost=" + context.getHost());
        System.out.println("text context ITestContext getHost=" + context.getPassedTests().size());
        Assert.assertEquals("variableAdAA", "variableAAA");
        Assert.assertEquals("variableAdAA", "variableAAA");
        System.out.println("text context ITestContext getHost=" + context.getPassedTests().size());

    }

    @AfterClass
    public void runAfterTest() {
        System.out.println("After Class method AAAA");
    }
}
