package leetcode;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode15
 * Copyright © : 8/25/2022
 */
public class LeetCode15 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(01101011));
    }
    public static int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            if((n & (1 << i)) != 0)
                count++;
        }

        return count;
    }

}




