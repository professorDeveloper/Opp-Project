package leetcode;

import java.util.Arrays;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode9
 * Copyright © : 8/24/2022
 */
public class LeetCode9 {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 3, 4, 5, 5, 3, 3, 5, 4, 4};
        int element = 0;
        for (int i = 0; i < array.length; i++) {
            element = array[i];
            boolean mavjud = false;
            for (int j = 0; j < i; j++) {
                if (element != array[j] && element!=array[j+1]) {
                    mavjud = true;
                    element=array[j];
                    break;
                }
            }

        }
        System.out.println(element);
    }
}


