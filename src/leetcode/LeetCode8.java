package leetcode;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode8
 * Copyright © : 8/23/2022
 */
public class LeetCode8 {
    public static void main(String[] args) {

    }

        public int finalValueAfterOperations(String[] operations) {
            int count=0;
            for(String w:operations )
            {
                if(w.equals("X++"))
                {
                    count++;
                }
                else if(w.equals("++X"))
                {
                    ++count;
                }
                else if(w.equals("X--"))
                {
                    count--;
                }
                else
                {
                    --count;
                }
            }
            return count;
        }

}
