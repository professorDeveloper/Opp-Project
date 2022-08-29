package leetcode;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode
 * Copyright © : 8/29/2022
 */
public class LeetCode20 {
    public static void main(String[] args) {
        System.out.println(reverseNumber(123));
    }
    public static int reverseNumber(int number){
        StringBuilder s=new StringBuilder(String.valueOf(number));

       return Integer.parseInt(s.reverse().toString());
    }

}
