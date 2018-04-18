package com.ggsoft.annotations.builders;

import com.ggsoft.annotations.LabeledPointAnnotation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Stroke;

import static com.ggsoft.annotations.AbstractAnnotation.DEFAULT_COLOR;
import static com.ggsoft.annotations.AbstractAnnotation.DEFAULT_FONT;
import static com.ggsoft.annotations.AbstractAnnotation.DEFAULT_STROKE;

public class LabeledPointAnnotationBuilder {
    private Color color = DEFAULT_COLOR;
    private Stroke stroke = DEFAULT_STROKE;
    private Font font = DEFAULT_FONT;
    private double x;
    private double y;
    private String text;

    public LabeledPointAnnotationBuilder withColor(Color color) {
        this.color = color;
        return this;
    }

    public LabeledPointAnnotationBuilder withStroke(Stroke stroke) {
        this.stroke = stroke;
        return this;
    }

    public LabeledPointAnnotationBuilder withX(double x) {
        this.x = x;
        return this;
    }

    public LabeledPointAnnotationBuilder withY(double y) {
        this.y = y;
        return this;
    }

    public LabeledPointAnnotationBuilder withText(String text) {
        this.text = text;
        return this;
    }

    public LabeledPointAnnotationBuilder withFont(Font font) {
        this.font = font;
        return this;
    }

    public LabeledPointAnnotation build() {
        return new LabeledPointAnnotation(color, stroke, font, x, y, text);
    }
}