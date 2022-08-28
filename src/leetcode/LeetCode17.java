package leetcode;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode17
 * Copyright © : 8/26/2022
 */
public class LeetCode17 {
    public static void main(String[] args) {
        System.out.println(findFinalValue(new int[]{1, 3, 6, 12,}, 3));
    }

        public static int findFinalValue(int[] nums, int original) {
            for(int i=0;i<nums.length;i++){
                if(nums[i]==original){
                    original=2*original;
                    i=-1;
                }
            }
            return original;
        }

}
