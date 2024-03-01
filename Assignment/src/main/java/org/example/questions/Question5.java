package org.example.questions;

public class Question5 {

    /**
     * 5. Complete the method boolean isRowMagic(int[][] a) that checks if the array a is
     * row-magic (this means that every row has the same row sum). Your solution should work for
     * any size of 2d array.
     * (2 marks for correctly functioning method).
     * For example, the following array is row magic as all rows sum to 6.
     */

    public Question5() {

        int[][] input = new int[][]{
                {1, 2, 3},
                {-1, 5, 2},
                {4, 0, 2}
        };

        System.out.println(isRowMagic(input));
    }

    public boolean isRowMagic(int[][] input) {
        int[] sums = new int[input.length];

        for (int row = 0; row < input.length; row++) {
            for (int num : input[row]) {
                sums[row] += num;
            }
        }

        boolean rowMagic = true;

        for (int i = 0; i < sums.length; i++) {
            if (i != sums.length - 1 && sums[i] != sums[i + 1]) {
                rowMagic = false;
                break;
            }
        }

        return rowMagic;
    }

}
