package practice;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> practice
 * Class Name -> Dialog
 * Copyright © : 9/15/2022
 */
public class Dialog {
    private String title;
    private String color;
    private  int with;
    private  int height;
    private Dialog(DialogBuilder dialogBuilder){
        this.title= dialogBuilder.title;
        this.color =dialogBuilder.color;
        this.height =dialogBuilder.height;
        this.with=dialogBuilder.with;
    }

    public String getTitle() {
        return title;
    }

    public String getColor() {
        return color;
    }

    public int getWith() {
        return with;
    }

    public int getHeight() {
        return height;
    }

    public static class DialogBuilder{
        private String title;
        private String color;
        private  int with;
        private  int height;

        public DialogBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public DialogBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public DialogBuilder setWith(int with) {
            this.with = with;
            return this;
        }

        public DialogBuilder setHeight(int height) {
            this.height = height;
            return this;
        }
    }
}

