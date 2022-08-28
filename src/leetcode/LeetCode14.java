package leetcode;

import java.util.Arrays;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode14
 * Copyright © : 8/25/2022
 */
public class LeetCode14 {
    public static void main(String[] args) {
        System.out.println(climbStairs(12));
    }
        public static int climbStairs(int n) {
            //declaring n+1 size dp
            int[] dp=new int[n+1];
            //filling dp array with -1
            Arrays.fill(dp,-1);

            return climb(n,dp);
        }
        public static int climb(int n,int[] dp){
            if(n<0){
                return 0;
            }
            if(n==0){
                return 1;
            }
            if(dp[n]!=-1){
                return dp[n];
            }

            return dp[n]=climb(n-1,dp)+climb(n-2,dp);
        }

    }
