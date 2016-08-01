package com.tmartsyniak.learning.shapes.task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RingTest {

    private double radiusInner = 3;
    private double radiusOuter = 5;
    private Circle outer = new Circle(radiusOuter);
    private Circle inner = new Circle(radiusInner);
    private Ring ring1 = new Ring(inner.getRadius(), outer.getRadius());
    private Ring ring2 = new Ring(outer.getRadius(), inner.getRadius());

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
