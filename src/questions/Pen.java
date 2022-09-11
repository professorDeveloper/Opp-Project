package questions;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> questions
 * Class Name -> Pen
 * Copyright © : 9/5/2022
 */
public class Pen {
    TextStyle textStyle;
    Color color;

    public Pen(TextStyle textStyle, Color color) {
        this.textStyle = textStyle;
        this.color = color;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public Color getColor() {
        return color;
    }
}
