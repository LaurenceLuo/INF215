package com.airbnb.lottie;

import org.junit.Test;
import static junit.framework.Assert.assertTrue;

public class TextDelegateTest {
    TextDelegate delegate=new TextDelegate();

    @Test
    public void testExist(){
        delegate.setText("testInput","testOutput");
        assertTrue(delegate.getTextInternal("testInput")=="testOutput");
    }

    @Test
    public void testInvalidate(){
        delegate.invalidateText("testInput");
        assertTrue(delegate.getTextInternal("testInput")=="testInput");
    }

    @Test
    public void testInvalidateAll(){
        delegate.invalidateAllText();
        assertTrue(delegate.getTextInternal("testInput")=="testInput");
    }

    @Test
    public void testNonExist(){
        assertTrue(delegate.getTextInternal("NonExist")=="NonExist");
    }


}
