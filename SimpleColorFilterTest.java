package com.airbnb.lottie;

import org.junit.Test;
import static junit.framework.Assert.assertTrue;

public class SimpleColorFilterTest {
    SimpleColorFilter filter=new SimpleColorFilter(1);

    @Test
    public void test(){
        assertTrue(filter!=null);
    }
}
