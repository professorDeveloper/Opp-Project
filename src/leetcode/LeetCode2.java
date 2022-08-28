package leetcode;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode2
 * Copyright © : 8/23/2022
 */
public class LeetCode2 {
    public static void main(String[] args) {
        String testString = "This is a sentence";
        String[] parts = testString.split(" ");
        String lastWord = parts[parts.length - 1];
        System.out.println(lastWord.length()); // "sentence"
    }
}
