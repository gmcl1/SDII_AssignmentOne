package org.example.questions;

import static org.example.Helper.printArray;

public class Question4 {

    /**
     * 4. Complete the method int[] allColSums(int[][] a) that calculates the col sum for
     * every column and returns each of the values in an array. Index i of the return array contains
     * the sum of elements in col i. Your solution should work for any size of 2d array.
     * (2 marks for correctly functioning method).
     * For example, for the following array the result should be [-2,13,7]
     */

    public Question4() {
        int[][] input = {
                {1, 8, 3},
                {-7, 5, 2},
                {4, 0, 2}
        };
        printArray(allColSums(input));
    }

    public int[] allColSums(int[][] input) {
        int[] sums = new int[input[0].length];

        for (int col = 0; col < input[0].length; col++) {
            for (int[] row : input) {
                sums[col] += row[col];
            }
        }

        return sums;
    }

}
