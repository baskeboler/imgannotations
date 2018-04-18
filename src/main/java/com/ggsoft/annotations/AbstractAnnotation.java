package com.ggsoft.annotations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Stroke;

public abstract class AbstractAnnotation implements Annotation {
    public static final Logger logger =
        LoggerFactory.getLogger(AbstractAnnotation.class);
    public static final Color DEFAULT_COLOR = Color.RED;
    public static final Stroke DEFAULT_STROKE = new BasicStroke(3);
    public static final Font DEFAULT_FONT = Font.getFont("SansSerif 16");

    private Color color = DEFAULT_COLOR;
    private Stroke stroke = DEFAULT_STROKE;
    private Font font = DEFAULT_FONT ;

    public AbstractAnnotation() {
    }

    public AbstractAnnotation(Color color, Stroke stroke) {
        this.color = color;
        this.stroke = stroke;
    }

    @Override
    public final void draw(Graphics2D graphics2D) {
        logger.info("Drawing {}", toString());
        graphics2D.setPaint(color);
        graphics2D.setStroke(stroke);
        graphics2D.setFont(font);
        drawAnnotation(graphics2D);
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Stroke getStroke() {
        return stroke;
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    public abstract void drawAnnotation(Graphics2D graphics2D);
}
