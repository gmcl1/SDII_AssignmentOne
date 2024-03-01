package org.example.questions;

public class Question6 {

    /**
     * 6. Complete the method public static boolean isColMagic(int[][] a) that checks if the array a
     * is column-magic (this means that every column has the same column sum). Your solution
     * should work for any size of 2d array.
     * (2 marks for correctly functioning method).
     * For example, the following array is column magic as all columns sum to 4.
     */

    public Question6() {
        int[][] input = new int[][]{
                {1, -1, 4, 10},
                {3, 5, 0, -6}
        };
        System.out.println(isColMagic(input));
    }

    public boolean isColMagic(int[][] input) {
        int[] sums = new int[input[0].length];

        for (int col = 0; col < input[0].length; col++) {
            for (int[] row : input) {
                sums[col] += row[col];
            }
        }

        boolean colMagic = true;

        for (int i = 0; i < sums.length; i++) {
            if (i != sums.length - 1 && sums[i] != sums[i + 1]) {
                colMagic = false;
                break;
            }
        }

        return colMagic;
    }

}
