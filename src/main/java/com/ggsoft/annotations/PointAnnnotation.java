package com.ggsoft.annotations;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class PointAnnnotation extends AbstractAnnotation implements Annotation {
    private double x;
    private double y;

    public PointAnnnotation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public PointAnnnotation(Color color, Stroke stroke, double x, double y) {
        super(color, stroke);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    @Override
    public void drawAnnotation(Graphics2D graphics2D) {
        graphics2D.drawOval((int) x, (int) y, 1, 1);

    }

    @Override
    public String toString() {
        return "PointAnnnotation{" +
            "x=" + x +
            ", y=" + y +
            "} " + super.toString();
    }
}
