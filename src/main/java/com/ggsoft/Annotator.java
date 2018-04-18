package com.ggsoft;

import com.ggsoft.annotations.Annotation;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Annotator {
    public static final String DEFAULT_IMG_FORMAT = "jpg";

    public void drawAnnotations(String input, String output, List<Annotation> annotations, String format) throws IOException {
        BufferedImage inFile = ImageIO.read(new File(input));
        applyAnnotations(inFile, annotations);
        ImageIO.write(inFile, format, new File(output));
    }

    private void applyAnnotations(BufferedImage inFile, List<Annotation> annotations) {
        Graphics2D graphics = inFile.createGraphics();
        annotations.forEach(a -> a.draw(graphics));
        inFile.flush();
    }

    public void drawAnnotations(BufferedImage image, String outPath, List<Annotation> annotations, String format) throws IOException {
        applyAnnotations(image, annotations);
        ImageIO.write(image, format, new File(outPath));
    }
}
