package com.tmartsyniak.learning.shapes.task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CircleTest {

    private double radius = 5;
    private Circle circle = new Circle(radius);

    @Test (expected = IllegalArgumentException.class)
    public void testConstructor() throws Exception {
        assertNotNull(circle);
        double radiusWrong = -5;
        Circle circleWrong = new Circle(radiusWrong);
    }

    @Test
    public void testCalcSquare() throws Exception {
        assertEquals(circle.calcSquare(), Math.PI * Math.pow(radius, 2), 0.0);
    }

    @Test
    public void testCalcBorderLength() throws Exception {
        assertEquals(circle.calcBorderLength(), radius * 2 * Math.PI, 0.0);
    }
}

