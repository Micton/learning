package com.tmartsyniak.learning.shapes.task1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RingTest {

    private double radiusInner;
    private double radiusOuter;
    private Circle outer;
    private Circle inner;
    private Ring ring1;
    private Ring ring2;

    @Before
    public void setUp() throws Exception {
        radiusInner = 3;
        radiusOuter = 5;
        outer = new Circle(radiusOuter);
        inner = new Circle(radiusInner);
        ring1 = new Ring(inner.getRadius(), outer.getRadius());
        ring2 = new Ring(outer.getRadius(), inner.getRadius());
    }

    @Test
    public void testConstructor() throws Exception {
        assertNotNull(ring1);
        assertNotNull(ring2);
        assertTrue(ring2.getOuter().getRadius() > ring2.getInner().getRadius());
        assertTrue(ring1.getOuter().getRadius() > ring2.getInner().getRadius());
        assertEquals(ring1, ring2);
    }

    @Test
    public void testCalcSquare() throws Exception {
        assertEquals(ring1.calcSquare(), outer.calcSquare() - inner.calcSquare(), 0.0);
        assertEquals(ring2.calcSquare(), outer.calcSquare() - inner.calcSquare(), 0.0);
    }

    @Test
    public void testCalcBorderLength() throws Exception {
        assertEquals(ring1.calcBorderLength(), outer.calcBorderLength() + inner.calcBorderLength(), 0.0);
        assertEquals(ring2.calcBorderLength(), outer.calcBorderLength() + inner.calcBorderLength(), 0.0);
    }
}
