package questions;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> questions
 * Class Name -> TextStyle
 * Copyright © : 9/5/2022
 */
public class TextStyle {
Color color;
String styleName;

    public TextStyle(Color color, String styleName) {
        this.color = color;
        this.styleName = styleName;
    }

    public Color getColor() {
        return color;
    }

    public String getStyleName() {
        return styleName;
    }
}
