package com.kpi.hello;

import com.kpi.extended.X;
import com.kpi.extended.Y;
import com.kpi.extended.Y1;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by SG0213064 on 2/19/2016.
 */
public class ListTest {

    @Test
    public void checkList() {
       List<? extends X> myYclasses= Arrays.asList(new Y(), new Y1());
        myYclasses.get(0).methodA();
        myYclasses.get(1).methodA();
    }
}
