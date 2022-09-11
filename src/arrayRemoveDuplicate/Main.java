package arrayRemoveDuplicate;

import java.util.Arrays;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> arrayRemoveDuplicate
 * Class Name -> Main
 * Copyright © : 9/4/2022
 */
public class Main {
    public static void main(String[] args) {
        int[]arrays={1,1,1,2,2,3,3,4,5,5};
        arrays=arrayRemoveDuplicate(arrays);
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i]!=0){
                System.out.println(arrays[i]);
            }
        }
    }

    public static int[] arrayRemoveDuplicate(int[] array) {
        int[] newArray = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int element = array[i]; // i=5; element=4
            boolean mavjud = false; //
            for (int j = 0; j < i; j++) {
                mavjud = mavjud || element == array[j];
            }
            if (!mavjud) {
                if (counterArray(element, array) == 1) {
                    newArray[count++] = element;
                }

            }// 7 4 2 3 1
        }
        return newArray;
    }

    public static int counterArray(int element, int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) counter++;
        }
        return counter;
    }
}
