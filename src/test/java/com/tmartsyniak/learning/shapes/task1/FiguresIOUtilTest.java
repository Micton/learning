package com.tmartsyniak.learning.shapes.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FiguresIOUtilTest {

    private double radiusInner;
    private double radiusMedium;
    private double radiusOuter;
    private Circle outer;
    private Circle inner;
    private Ring ring1;
    private Ring ring2;
    private List<Figure> figures;
    String filePath;
    FiguresIOUtil figuresIOUtil;

    @Before
    public void setUp() throws Exception {
        radiusInner = 3;
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
        filePath = "src/main/java/com/tmartsyniak/learning/shapes/task1/test.ser";
        figuresIOUtil = new FiguresIOUtil();
    }

    @Test
    public void testReadFiguresFromFile() throws Exception {
        figuresIOUtil.writeFiguresToFile(figures, filePath);
        List<Figure> read = figuresIOUtil.readFiguresFromFile(filePath);
        Assert.assertEquals(figures, read);
    }

    @Test
    public void testWriteFiguresToFile() throws Exception {
        figuresIOUtil.writeFiguresToFile(figures, filePath);
        List<Figure> read = figuresIOUtil.readFiguresFromFile(filePath);
        Assert.assertEquals(figures, read);
    }
}
