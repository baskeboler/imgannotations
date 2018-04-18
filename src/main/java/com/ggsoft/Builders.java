package com.ggsoft;

import com.ggsoft.annotations.builders.LabelAnnotationBuilder;
import com.ggsoft.annotations.builders.LabeledPointAnnotationBuilder;
import com.ggsoft.annotations.builders.PointAnnnotationBuilder;
import com.ggsoft.annotations.builders.RectangleAnnotationBuilder;

public class Builders {
    public static final LabelAnnotationBuilder label() {
        return new LabelAnnotationBuilder();
    }

    public static final PointAnnnotationBuilder point() {
        return new PointAnnnotationBuilder();
    }

    public static final RectangleAnnotationBuilder rect() {
        return new RectangleAnnotationBuilder();
    }

    public static final LabeledPointAnnotationBuilder labeledPoint() {
        return new LabeledPointAnnotationBuilder();
    }
}
