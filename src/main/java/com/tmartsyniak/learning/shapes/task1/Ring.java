package com.tmartsyniak.learning.shapes.task1;

// Class Ring has relation "has a" with Circle, as it consists of 2 circles
public class Ring implements Figure {
    private Circle inner;
    private Circle outer;

    public Ring() {
    }

    public Ring(int innerRadius, int outerRadius) {
        if (innerRadius > outerRadius) {
            int swap = innerRadius;
            innerRadius = outerRadius;
            outerRadius = swap;
        }
        this.inner = new Circle(innerRadius);
        this.outer = new Circle(outerRadius);
    }

    @Override
    public double calcSquare() {
        return outer.calcSquare() - inner.calcSquare();
    }

    @Override
    public double calcBorderLength() {
        return inner.calcBorderLength() + outer.calcBorderLength();
    }

    @Override
    public String toString() {
        return "Ring{" +
                "inner=" + inner.getRadius() +
                ", outer=" + outer.getRadius() +
                '}';
    }
}
