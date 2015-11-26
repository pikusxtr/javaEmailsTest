package com.kpi.template;
import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.Assert;
/**
 * Created by SG0213064 on 3/3/2015.
 */
public class UnitTest001 {

    @Test
    public void dummy() {
        CorpoMan korpo1 = new CorpoMan("Maciek", "Piks");
        Assert.assertEquals("Maciek", korpo1.firstName);
        Assert.assertEquals("Maciek1", korpo1.firstName);
        Assert.assertEquals("Maciek", korpo1.firstName);

    }
}
