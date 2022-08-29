package leetcode;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode21
 * <salom>* Copyright © : 8/29/2022</salom>
 **/
public class LeetCode21 {
    public static void main(String[] args) {
        System.out.println(minOperator(new int[]{}));
    }

    public static int minOperator(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (min > num) {
                min = num;
            }
        }
        return min;



    }
}
