package com.ggsoft.annotations.builders;

import com.ggsoft.annotations.RectangleAnnotation;

import java.awt.Color;
import java.awt.Stroke;

import static com.ggsoft.annotations.AbstractAnnotation.DEFAULT_COLOR;
import static com.ggsoft.annotations.AbstractAnnotation.DEFAULT_STROKE;

public class RectangleAnnotationBuilder {
    private Color color = DEFAULT_COLOR;
    private Stroke stroke = DEFAULT_STROKE;
    private double top;
    private double left;
    private double width;
    private double height;

    public RectangleAnnotationBuilder withColor(Color color) {
        this.color = color;
        return this;
    }

    public RectangleAnnotationBuilder withStroke(Stroke stroke) {
        this.stroke = stroke;
        return this;
    }

    public RectangleAnnotationBuilder withTop(double top) {
        this.top = top;
        return this;
    }

    public RectangleAnnotationBuilder withLeft(double left) {
        this.left = left;
        return this;
    }

    public RectangleAnnotationBuilder withWidth(double width) {
        this.width = width;
        return this;
    }

    public RectangleAnnotationBuilder withHeight(double height) {
        this.height = height;
        return this;
    }

    public RectangleAnnotation build() {
        return new RectangleAnnotation(color, stroke, top, left, width, height);
    }
}