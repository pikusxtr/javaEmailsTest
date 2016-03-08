package com.kpi.testng;

/**
 * Created by SG0213064 on 3/8/2016.
 */
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelMethodTest1
{
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class1 method executed");
    }

    @BeforeMethod
    public void beforeMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("Before test-method1. Thread id is: " + id);
    }

    @Test
    public void testMethods1() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method 1. Thread id is: " + id);
    }

    @Test
    public void testMethods2() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method 2. Thread id is: " + id);
    }

    @Test
    public void testMethods3() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method 3. Thread id is: " + id);
    }

    @Test
    public void testMethods4() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method 4. Thread id is: " + id);
    }


    @AfterMethod
    public void afterMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("After test-method1. Thread id is: " + id);
    }
}