package leetcode;

import java.util.Arrays;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> Leetcode4
 * Copyright © : 8/23/2022
 */
public class Leetcode4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(followArray(new int[]{1, 2, 3, 4})));
    }

    public static int[] followArray(int[] arrays) {
        int[]newArray=new int[arrays.length+arrays.length];
        for(int i=0;i< arrays.length;i++){
             newArray[i]=arrays[i];
            newArray[i+ arrays.length]=arrays[i];
        }
        return newArray;
    }
}
