package com.tmartsyniak.learning.shapes.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FiguresSearchUtilTest {

    private double radiusInner;
    private double radiusMedium;
    private double radiusOuter;
    private Circle outer;
    private Circle inner;
    private Ring ring1;
    private Ring ring2;
    private List<Figure> figures;
    FiguresSearchUtil searchUtil;

    @Before
    public void setUp() throws Exception {
        radiusInner = 2;
        radiusMedium = 5;
        radiusOuter = 7;
        outer = new Circle(radiusOuter);
        inner = new Circle(radiusInner);
        ring1 = new Ring(radiusMedium, outer.getRadius());
        ring2 = new Ring(outer.getRadius(), inner.getRadius());
        figures = new ArrayList<>();
        figures.add(outer);
        figures.add(inner);
        figures.add(ring1);
        figures.add(ring2);
        searchUtil = new FiguresSearchUtil();
    }

    @Test
    public void testGetFigureWithMaximumSquare() throws Exception {
        Assert.assertEquals(searchUtil.getFigureWithMaximumSquare(figures).calcSquare(), outer.calcSquare(), 0.0);
    }

    @Test
    public void testGetFigureWithMaximumBorderLength() throws Exception {
        Assert.assertEquals(searchUtil.getFigureWithMaximumBorderLength(figures).calcBorderLength(), ring1.calcBorderLength(), 0.0);
    }
}
