package leetcode;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode12
 * Copyright © : 8/24/2022
 */
public class LeetCode12 {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }
        public static boolean checkPerfectNumber(int num) {
            if (num == 1) {
                return false;
            }
            return getDivisorSum(num) == num;
        }

        public static int getDivisorSum(int num) {
            int sum = 0;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    sum += i + num / i;
                }
            }
            return sum + 1;
        }
    }

