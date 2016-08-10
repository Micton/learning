package com.tmartsyniak.learning.shapes.task1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CircleTest {

    private double radius;
    private Circle circle;
    private double radiusWrong;
    Circle circleWrong;

    @Before
    public void setUp() throws Exception {
        radius = 5;
        circle = new Circle(radius);
        radiusWrong = -5;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor() throws Exception {
        assertNotNull(circle);
        circleWrong = new Circle(radiusWrong);
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

