package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode10
 * Copyright © : 8/24/2022
 */
public class LeetCode10 {
    public static void main(String[] args) {
    reverseString(new char[]{'s','a','l','o','m'});
    }
    public static void reverseString(char[] s) {
        StringBuilder stringBuffer=new StringBuilder(s.toString());
        char[] charArray =stringBuffer.reverse().toString().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }
    }
}
