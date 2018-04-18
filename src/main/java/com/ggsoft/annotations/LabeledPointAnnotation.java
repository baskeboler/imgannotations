package com.ggsoft.annotations;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class LabeledPointAnnotation extends PointAnnnotation implements Annotation {
    private String text = "";

    public LabeledPointAnnotation(Color color, Stroke stroke, Font font, double x, double y, String text) {
        super(color, stroke, x, y);
        this.text = text;
        if (font != null)
            setFont(font);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void drawAnnotation(Graphics2D graphics2D) {
//        super.drawAnnotation(graphics2D);
        graphics2D.drawOval((int)getX(), (int) getY(), 6, 6);
        graphics2D.drawString(text,
            (int) getX(),
            (int) getY() + graphics2D.getFont().getSize() + 2);
    }

    @Override
    public String toString() {
        return "LabeledPointAnnotation{" +
            "text='" + text + '\'' +
            "} " + super.toString();
    }
}
