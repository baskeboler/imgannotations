package com.ggsoft.annotations.builders;

import com.ggsoft.annotations.PointAnnnotation;

import java.awt.Color;
import java.awt.Stroke;

import static com.ggsoft.annotations.AbstractAnnotation.DEFAULT_COLOR;
import static com.ggsoft.annotations.AbstractAnnotation.DEFAULT_STROKE;

public class PointAnnnotationBuilder {
    private double x;
    private double y;
    private Color color = DEFAULT_COLOR;
    private Stroke stroke = DEFAULT_STROKE;

    public PointAnnnotationBuilder withX(double x) {
        this.x = x;
        return this;
    }

    public PointAnnnotationBuilder withY(double y) {
        this.y = y;
        return this;
    }

    public PointAnnnotationBuilder withColor(Color color) {
        this.color = color;
        return this;
    }

    public PointAnnnotationBuilder withStroke(Stroke stroke) {
        this.stroke = stroke;
        return this;
    }

    public PointAnnnotation build() {
        return new PointAnnnotation(color, stroke, x, y);
    }
}