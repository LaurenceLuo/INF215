package com.airbnb.lottie;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class LTest {

    @Test
    public void test(){
        L.setTraceEnabled(true);
        L.beginSection("test");
        assertTrue(L.endSection("test")!=0f);
    }

}
