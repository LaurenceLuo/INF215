package com.airbnb.lottie;

import android.graphics.Rect;
import android.support.v4.util.LongSparseArray;
import android.support.v4.util.SparseArrayCompat;

import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.utils.LottieValueAnimator;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class LottieAnimationTest {

    private LottieValueAnimator animator;

    @Before
    public void setup() {
        animator = new LottieValueAnimator() {
            @Override public void postFrameCallback() {
                isRunning = true;
            }
            @Override public void removeFrameCallback() {
                isRunning = false;
            }
        };
        LottieComposition composition = new LottieComposition();
        composition.init(new Rect(), 0, 1000, 1000, new ArrayList<Layer>(),
                new LongSparseArray<Layer>(0), new HashMap<String, List<Layer>>(0),
                new HashMap<String, LottieImageAsset>(0), new SparseArrayCompat<FontCharacter>(0),
                new HashMap<String, Font>(0));
        animator.setComposition(composition);
    }

    @Test
    public void testInitialState() {
        assertEquals(0f, animator.getFrame());
    }

    @Test
    public void testPlayAnimation(){
        animator.setFrame(500);
        animator.playAnimation();
        assertTrue(animator.isRunning());
    }

    @Test
    public void testPauseAnimation() {
        animator.pauseAnimation();
        assertTrue(!animator.isRunning());
    }

    @Test
    public void testResumeAnimation() {
        animator.resumeAnimation();
        assertTrue(animator.isRunning());
    }

    @Test
    public void testCancel() {
        animator.cancel();
        assertTrue(!animator.isRunning());
    }

    @Test
    public void testResumeAgain() {
        animator.resumeAnimation();
        assertTrue(animator.isRunning());
    }
}
