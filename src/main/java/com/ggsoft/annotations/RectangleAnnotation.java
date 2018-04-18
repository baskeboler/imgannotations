package com.ggsoft.annotations;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class RectangleAnnotation extends AbstractAnnotation implements Annotation {

    private double top;
    private double left;
    private double width;
    private double height;



    public RectangleAnnotation(Color color, Stroke stroke, double top, double left, double width, double height) {
        super(color, stroke);
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public double getTop() {
        return top;
    }

    public void setTop(double top) {
        this.top = top;
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public void drawAnnotation(Graphics2D graphics2D) {
        graphics2D.drawRect((int) left, (int) top, (int) width, (int) height);

    }

    @Override
    public String toString() {
        return "RectangleAnnotation{" +
            "top=" + top +
            ", left=" + left +
            ", width=" + width +
            ", height=" + height +
            "} " + super.toString();
    }
}
