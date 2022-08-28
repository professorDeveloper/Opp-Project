package leetcode;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode11
 * Copyright © : 8/24/2022
 */
public class LeetCode11 {
    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++) {
//            System.out.print(i+",");
//        }
//        System.out.println("\b");

        System.out.println(removePalindromeSub("ababa"));
    }

    public static int removePalindromeSub(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (new StringBuilder(s).reverse().toString().equals(s)) {
            return 1;
        }
        return 2;
    }
}

