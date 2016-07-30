package com.tmartsyniak.learning.shapes.task2;

import java.awt.Color;
import java.awt.Graphics;

class Rectangle extends Shape {

    private Point topLeft;
    private Point topRight;
    private Point bottomLeft;
    private Point bottomRight;
    private Color color;

    public Rectangle(int topLeftX, int topLeftY, int topRightX, int topRightY,
                     int bottomLeftX, int bottomLeftY, int bottomRightX, int bottomRightY, Color color) {
        this.topLeft = new Point(topLeftX, topLeftY);
        this.topRight = new Point(topRightX, topRightY);
        this.bottomLeft = new Point(bottomLeftX, bottomLeftY);
        this.bottomRight = new Point(bottomRightX, bottomRightY);
        this.color = color;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public Color getColor() {
        return color;
    }

    public void draw(Graphics graphics) {
        setVisible(false);
        graphics.setColor(color);
        graphics.drawLine(bottomLeft.getX(), bottomLeft.getY(), bottomRight.getX(), bottomRight.getY());
        graphics.drawLine(bottomRight.getX(), bottomRight.getY(), topRight.getX(), topRight.getY());
        graphics.drawLine(topRight.getX(), topRight.getY(), topLeft.getX(), topLeft.getY());
        graphics.drawLine(topLeft.getX(), topLeft.getY(), bottomLeft.getX(), bottomLeft.getY());
        setVisible(true);
    }
}
