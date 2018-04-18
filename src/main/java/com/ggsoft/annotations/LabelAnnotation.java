package com.ggsoft.annotations;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class LabelAnnotation extends AbstractAnnotation implements Annotation {
    private double x;
    private double y;
    private String text;



    public LabelAnnotation(Color color, Stroke stroke, double x, double y, String text) {
        super(color, stroke);
        this.x = x;
        this.y = y;
        this.text = text;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public void drawAnnotation(Graphics2D graphics2D) {
//        graphics2D.setFont(Font.);
        graphics2D.drawString(text, (float) x, (float) y);

    }

    @Override
    public String toString() {
        return "LabelAnnotation{" +
            "x=" + x +
            ", y=" + y +
            ", text='" + text + '\'' +
            "} " + super.toString();
    }
}
