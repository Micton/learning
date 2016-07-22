package com.tmartsyniak.learning.shapes.task2;

/*The Shape class provides method draw(...) for drawing shapes. Move method draw(...) to Rectangle class.
Please propose the other solutions for improving quality of the code.*/
import java.awt.Graphics;

abstract class Shape {

    private boolean visible;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    abstract void draw(Graphics graphics);
}
// As rectangle is a specific shape better is to inherit it from Shape
// As Shape is a abstract concept better is declare it abstract
// Field "title" is no needed more as title is always defined by a subclass name
// we can move "visible" variable to superclass as it is applicable to every existing shape
// we can add astract method "abstract void draw(Graphics graphics);" to Shape class as every subshape can de drawn

