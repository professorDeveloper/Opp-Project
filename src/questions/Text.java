package questions;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> questions
 * Class Name -> Text
 * Copyright © : 9/5/2022
 */
public class Text {
    Pen pen;
    private String string = "";

    public Text(Pen pen) {
        this.pen = pen;
    }//2321

    public boolean addText(String str) {
        string.concat(str);
        return true;
    }

    public String show() {
        return string.concat(string);
    }

    public boolean clear() {
        string = "";
        return true;
    }

    public int getLineCount() {
        return string.length();
    }

    public String removeLine(int index) {
        return string.substring(index).toString();
    }

}
