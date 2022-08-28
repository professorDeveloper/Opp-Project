package leetcode;

import java.util.Arrays;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode18
 * Copyright © : 8/28/2022
 */
public class LeetCode18 {
    public static void main(String[] args) {
//        Input: mat = [[3,3,1,1],[2,2,1,2],[1,1,1,2]]
        System.out.println(Arrays.deepToString(diagonalSort(new int[][]{
                {3, 3, 1, 1},
                {2, 2, 1, 2},
                {1, 1, 1, 2}
        })));
    }
        public static int[][] diagonalSort(int[][] M) {
            int y = M.length, x = M[0].length - 1;
            int[] diag = new int[y];
            for (int i = 2 - y; i < x; i++) {
                int k = 0;
                for (int j = 0; j < y; j++)
                    if (i+j >= 0 && i+j <= x)
                        diag[k++] = M[j][i+j];
                Arrays.sort(diag, 0, k);
                k = 0;
                for (int j = 0; j < y; j++)
                    if (i+j >= 0 && i+j <= x)
                        M[j][i+j] = diag[k++];
            }
            return M;
        }

}
