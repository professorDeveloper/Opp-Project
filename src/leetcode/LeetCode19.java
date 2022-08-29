package leetcode;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode19
 * Copyright © : 8/29/2022
 */
public class LeetCode19 {
    public static void main(String[] args) {
        System.out.println (IsPower3(33));
    }
    public static boolean IsPower3(int k){
        int a=3;
        int b=a;
        while (a<k){
            a*=b;
        }
        if ( a==k ){
            return true;
        }else return false;
    }



}
