package util;

import homework10.bookShop.Book;

public class TestUtil {
    public static void assertEquals(Object result, Object expected) {
        if (!result.equals(expected)) {
            throw new IllegalArgumentException("Kutilgan natija: " + expected + " Sizning natijangiz:" + result);
        }
    }
    public static Book[] ArrayListTalat(Book[] array) {
        Book[] objects = new Book[array.length + array.length / 2];
        for (int i = 0; i < array.length; i++) {
            objects[i] = array[i];
        }
        return array = objects;//referenc ketdi
    }

    public static int[] ArrayListTalat(int[] array) {
        int[] objects = new int[array.length + array.length / 2];
        for (int i = 0; i < array.length; i++) {
            objects[i] = array[i];
        }
        return array = objects;//referenc ketdi
    }


}
