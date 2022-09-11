package practice;

import homework10.bookShop.Book;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> practice
 * Class Name -> practice
 * Copyright © : 9/8/2022
 */
public class practice {
    public static void main(String[] args) {
        Box box = new Box(4);
        Things things = new Things(2, "Cola");
        System.out.println(box.isFull());
        System.out.println(box.push(things));
        System.out.println(box.push(things));
        System.out.println(box.isFull());

    }
}

class Box {
    private int size;
    private Things[] thingsArray;
    private int boxVolume;
    private int count;

    public Box(int size) {
        this.size = size;
        thingsArray = new Things[16];
    }

    public boolean push(Things things) {
        if (isFull()) return false;
        if (count == 16) {
            thingsArray = ArraysUtil.addArrayLists(thingsArray);
        }
        boxVolume += things.getThingsSize();
        thingsArray[count++] = things;
        return true;
    }

    public boolean isFull() {
        return boxVolume >= size;
    }
}

class Things {
    private String name;
    private int thingsSize;

    public Things(int thingsSize, String name) {
        this.thingsSize = thingsSize;
        this.name = name;
    }

    public int getThingsSize() {
        return thingsSize;
    }
}

class ArraysUtil {
    public static Book[] addArrayLists(Book[] array) {
        Book[] objects = new Book[array.length + array.length / 2];
        for (int i = 0; i < array.length; i++) {
            objects[i] = array[i];
        }
        return array = objects;//referenc ketdi
    }

    public static int[] addArrayLists(int[] array) {
        int[] objects = new int[array.length + array.length / 2];
        for (int i = 0; i < array.length; i++) {
            objects[i] = array[i];
        }
        return array = objects;//referenc ketdi
    }

    public static Things[] addArrayLists(Things[] array) {
        Things[] objects = new Things[array.length + array.length / 2];
        for (int i = 0; i < array.length; i++) {
            objects[i] = array[i];
        }
        return array = objects;//referenc ketdi
    }

}

