package leetcode;

import java.util.Arrays;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode6
 * Copyright © : 8/23/2022
 */
public class LeetCode6 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        int max= Integer.MIN_VALUE;
        int min= 0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,sum-min);
            min=Math.min(min,sum);
        }
        return max;
    }

}
