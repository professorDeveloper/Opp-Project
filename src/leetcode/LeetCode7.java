package leetcode;

import java.util.Arrays;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode7
 * Copyright © : 8/23/2022
 */
public class LeetCode7 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4, 5, 6})));
    }
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
