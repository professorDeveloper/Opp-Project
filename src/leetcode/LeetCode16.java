package leetcode;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode16
 * Copyright © : 8/26/2022
 */
public class LeetCode16 {
    public static void main(String[] args) {


        System.out.println(interpret("(al)G(al)()()G"));
    }
    public static String interpret(String command) {
        String str=command.replace("()","o");

        return str.replace("(al)","al");
    }
}
