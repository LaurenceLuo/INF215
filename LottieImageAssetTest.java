package com.airbnb.lottie;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertTrue;

public class LottieImageAssetTest {
    LottieImageAsset asset;

    @Before
    public void setup(){
        asset=new LottieImageAsset(20,80,"LL","test","local");
    }

    @Test
    public void testWidth(){
        assertTrue(asset.getWidth()==20);
    }

    @Test
    public void testHeight(){
        assertTrue(asset.getHeight()==80);
    }

    @Test
    public void testID(){
        assertTrue(asset.getId()=="LL");
    }

    @Test
    public void testFileName(){
        assertTrue(asset.getFileName()=="test");
    }

    @Test
    public void testDirName(){
        assertTrue(asset.getDirName()=="local");
    }
}
