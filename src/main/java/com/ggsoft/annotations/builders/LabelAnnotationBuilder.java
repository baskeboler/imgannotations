package com.ggsoft.annotations.builders;

import com.ggsoft.annotations.LabelAnnotation;

import java.awt.Color;
import java.awt.Stroke;

import static com.ggsoft.annotations.AbstractAnnotation.DEFAULT_COLOR;
import static com.ggsoft.annotations.AbstractAnnotation.DEFAULT_STROKE;

public class LabelAnnotationBuilder {
    private Color color = DEFAULT_COLOR;
    private Stroke stroke = DEFAULT_STROKE;
    private double x;
    private double y;
    private String text;

    public static LabelAnnotationBuilder newLabelAnnotation() {
        return new LabelAnnotationBuilder();
    }

    public LabelAnnotationBuilder withColor(Color color) {
        this.color = color;
        return this;
    }

    public LabelAnnotationBuilder withStroke(Stroke stroke) {
        this.stroke = stroke;
        return this;
    }

    public LabelAnnotationBuilder withX(double x) {
        this.x = x;
        return this;
    }

    public LabelAnnotationBuilder withY(double y) {
        this.y = y;
        return this;
    }

    public LabelAnnotationBuilder withText(String text) {
        this.text = text;
        return this;
    }

    public LabelAnnotation build() {
        return new LabelAnnotation(color, stroke, x, y, text);
    }
}