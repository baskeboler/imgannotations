package com.ggsoft;

import com.ggsoft.annotations.Annotation;
import com.ggsoft.annotations.RectangleAnnotation;
import org.junit.Assert;
import org.junit.Test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.ggsoft.Annotator.DEFAULT_IMG_FORMAT;

public class AnnotatorTest {
    Annotator an = new Annotator();

    @Test
    public void drawAnnotations() {
        List<Annotation> annotations = Arrays.asList(
            Builders.rect().withTop(10).withLeft(10).withWidth(50).withHeight(50).build(),
            Builders.point().withX(100).withY(100).build(),
            Builders.label().withX(50).withY(50).withText("Hello World").build()
        );
//        Annotator annotator = new Annotator();
        try {
            an.drawAnnotations("/home/victor/carlwallpaper.jpg", "/home/victor/carlwallpaper_with_annotations.jpg", annotations, DEFAULT_IMG_FORMAT);
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    private BufferedImage emptyCanvas() {
        return new BufferedImage(1024, 768, BufferedImage.TYPE_INT_RGB);
    }

    @Test
    public void drawManySquaresInCanvas() {
        BufferedImage image = emptyCanvas();
        Graphics2D graphics = image.createGraphics();
        graphics.setBackground(Color.WHITE);
        Rectangle bounds = graphics.getDeviceConfiguration().getBounds();
        graphics.fillRect(0, 0,
            (int) bounds.getWidth(),
            (int) bounds.getHeight());
        List<Annotation> annotations = new ArrayList<>();
        for (int i = 0; i < 300; i++) {
            RectangleAnnotation rect = Builders.rect()
                .withLeft(i * 9 + 1)
                .withTop(i * 9 + 1)
                .withHeight(300)
                .withWidth(300)
                .build();
            annotations.add(rect);
        }

        try {
            an.drawAnnotations(image, "output.jpg", annotations, DEFAULT_IMG_FORMAT);
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void drawLabeledPoints() {
        BufferedImage bufferedImage = emptyCanvas();
        Graphics2D graphics = bufferedImage.createGraphics();


        graphics.setBackground(Color.WHITE);
        Rectangle bounds = graphics.getDeviceConfiguration().getBounds();
        graphics.fillRect(0, 0,
            (int) bounds.getWidth(),
            (int) bounds.getHeight());
        //Font sansSerif = new Font("Courier New", Font.PLAIN, 36);
//        Map<TextAttribute, Object> attributes = new HashMap<>();
//        attributes.put(TextAttribute.FOREGROUND, Color.RED);
//        attributes.put(TextAttribute.BACKGROUND, Color.WHITE);
//        attributes.put(TextAttribute.FAMILY, currentFont.getFamily());
//        attributes.put(TextAttribute.SIZE, currentFont.getSize() * 12.0f);
        graphics.setPaint(Color.darkGray);
        Font currentFont = graphics.getFont();

        Font font = Font.getFont("Arial-BOLD-36", currentFont)
            .deriveFont(Font.BOLD, 72);
        List<Annotation> annotations = Arrays.asList(
            Builders.labeledPoint()
                .withText("Hello World!")
                .withX(100)
                .withY(200)
                .build(),
            Builders.labeledPoint()
                .withText("Other Text!").withY(500)
                .withX(300).withFont(font)
                .build()
        );
        graphics.setFont(font);
        try {
            an.drawAnnotations(bufferedImage, "output2.jpg", annotations, DEFAULT_IMG_FORMAT);
        } catch (IOException e) {

            Assert.fail(e.getMessage());
        }
    }
}