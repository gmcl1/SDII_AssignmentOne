package org.example.questions;

public class Question7 {

    /**
     * 7. Complete the method boolean isRowEvenInc(int[][] a) that checks if the row sum of even
     * numbers in array a are increasing in size. Your solution should work for any size of 2d array.
     * (2 marks for correctly functioning method).
     * For example, the following array row sum evens [-6, 2, 6] are increasing in value so the
     * result should be true.
     */

    public Question7() {
        int[][] input = new int[][]{
                {1, -4, -2},
                {-7, 2, -3},
                {4, 0, 2}
        };
        System.out.println(isRowEvenInc(input));
    }

    public boolean isRowEvenInc(int[][] input) {
        boolean inc = true;

        int[] sums = new int[input.length];
        for (int row = 0; row < input.length; row++) {
            for (int number : input[row]) {
                if (number % 2 == 0) sums[row] += number;
            }
        }

        for (int i = 0; i < sums.length; i++) {
            if (i != sums.length - 1 && sums[i] >= sums[i + 1]) {
                inc = false;
                break;
            }
        }

        return inc;
    }

}
