package leetcode;

import java.util.Stack;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode13
 * Copyright © : 8/24/2022
 */
public class LeetCode13 {
    public static void main(String[] args) {
//        System.out.println(isValid("({}"));
//        System.out.println(isValid("({})"));
//        System.out.println(isValid("(}"));
//        System.out.println(isValid("(){}"));
//        System.out.println(isValid("()[]"));

        int a = 12;
        int b = 14;
        int c=~a+~b;
        boolean v1=true;
        boolean v2=false;
        boolean v3=v1|v2&& c<a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else {
                if (stack.size() == 0) return false;
                if (c == ')' && stack.pop() != '(') return false;
                if (c == ']' && stack.pop() != '[') return false;
                if (c == '}' && stack.pop() != '{') return false;
            }
        }
        return stack.size() == 0 ? true : false;
    }
}
