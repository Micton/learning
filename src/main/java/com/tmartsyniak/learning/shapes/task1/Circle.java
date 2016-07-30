package com.tmartsyniak.learning.shapes.task1;

/*Create classes Circle and Ring with methods for calculation of border length and square of figures. Give your suggestions about relations between
classes (is-a, has-a, use-a, etc.). Write well commented code with examples of using these classes.
        Write code for reading and writing collection of these objects from (into) file.
        Find object with maximal square.
        Find object with maximal border length.
        Write code for handling the incorrect format of incoming file.*/

// Class Ring has relation "has a" with Circle, as it consists of 2 circles
public class Circle implements Figure {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("circle radius cannot be a negative number");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calcSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calcBorderLength() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}




