# imgannotations

Simple library for painless image labeling. Annotate images with labels, points and rectangles. Used for highlighting image features and visualization of object detection results.

## usage

```java
class Example {
    public static void main() {
        List<Annotation> annotations = Arrays.asList(
            Builders.rect().withTop(10).withLeft(10).withWidth(50).withHeight(50).build(),
            Builders.point().withX(100).withY(100).build(),
            Builders.label().withX(50).withY(50).withText("Hello World").build()
        );
        Annotator annotator = new Annotator();
        try {
            annotator.drawAnnotations("input.jpg", "output.jpg", annotations, DEFAULT_IMG_FORMAT);
        } catch (IOException e) {
            e.printStackTrace();
        }       
    }
}
```

![http://github.com/baskeboler/imgannotations/raw/master/foto_etiquetada.jpg] (Example image with region selections and labels)
