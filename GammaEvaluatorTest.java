package com.airbnb.lottie;

import com.airbnb.lottie.utils.GammaEvaluator;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GammaEvaluatorTest {
    GammaEvaluator evaluator;

    @Before
    public void setup(){
        evaluator=new GammaEvaluator();
    }

    @Test
    public void testFracZero(){
        assertEquals(0,evaluator.evaluate(0f,0,10));
    }

    @Test
    public void testFracOne(){
        assertEquals(10,evaluator.evaluate(1f,0,10));
    }

    @Test
    public void testFracPointFive(){
        assertEquals(5,evaluator.evaluate(0.5f,0,10));
    }

    @Test
    public void testBoundary(){
        assertEquals(0,evaluator.evaluate(1f,0,0));
        assertEquals(10,evaluator.evaluate(1f,10,10));
    }
}
