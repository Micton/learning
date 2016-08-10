package com.tmartsyniak.learning.shapes.task1;

// Class Ring has relation "has a" with Circle, as it consists of 2 circles
public class Ring implements Figure {
    private Circle inner;
    private Circle outer;

    public Ring() {
    }

    public Ring(double innerRadius, double outerRadius) {
        if (innerRadius > outerRadius) {
            double swap = innerRadius;
            innerRadius = outerRadius;
            outerRadius = swap;
        }
        this.inner = new Circle(innerRadius);
        this.outer = new Circle(outerRadius);
    }

    public Circle getInner() {
        return inner;
    }

    public Circle getOuter() {
        return outer;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ring ring = (Ring) o;

        if (inner != null ? !inner.equals(ring.inner) : ring.inner != null) return false;
        return outer != null ? outer.equals(ring.outer) : ring.outer == null;

    }

    @Override
    public int hashCode() {
        int result = inner != null ? inner.hashCode() : 0;
        result = 31 * result + (outer != null ? outer.hashCode() : 0);
        return result;
    }
}
