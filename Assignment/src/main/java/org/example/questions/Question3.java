package org.example.questions;

import static org.example.Helper.printArray;

public class Question3 {

    /**
     * 3. Complete the method int[] allRowSums(int[][] a) that calculates the row sum for
     * every row and returns each of the values in an array. Index i of the return array contains the
     * sum of elements in row i. Your solution should work for any size of 2d array.
     * (2 marks for correctly functioning method).
     * For example, for the following array the result should be [12,0,6]
     */

    public Question3() {
        int[][] input = {
                {1, 8, 3},
                {-7, 5, 2},
                {4, 0, 2},
        };
        printArray(allRowSums(input));
    }

    public int[] allRowSums(int[][] input) {
        int[] sums = new int[input.length];
        for (int row = 0; row < input.length; row++) {
            for (int num : input[row]) {
                sums[row] += num;
            }
        }
        return sums;
    }

}
