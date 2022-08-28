package leetcode;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode1
 * Copyright © : 8/23/2022
 */
public class LeetCode1 {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 4, 6}, 2));
    }
    public static int searchInsert(int[] nums, int target) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int left = 1;
        int right = nums.length ;
        while (left < right) { // at least 3 elements
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (nums[left] >= target) {
            return left;
        } else if (nums[right] >= target) {
            return right;
        } else {
            return right ;
        }
    }
}
