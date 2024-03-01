package org.example.questions;

import java.util.Arrays;

public class Question2 {

    /**
     * 2. Complete the method int rowSum(int[][] a, int x) that returns the sum of the
     * elements in Row x of the 2d array a and complete the method int colSum(int[][] a,
     * int y) that returns the sum of the elements in Column y of the 2d array a. Your solution
     * should work for any size of 2d array.
     * (4 marks – 2 marks for each correctly functioning method).
     * For example, the following array has a sum of 12 for row 0 and a sum of 7 for column 2.
     */

    public Question2() {
        int[][] input = {
                {1, 8, 3},
                {-7, 5, 2},
                {4, 0, 2},
        };
        System.out.println(rowSum(input, 0));
        System.out.println(colSum(input, 2));
    }

    public int rowSum(int[][] input, int row) {
        int sum = 0;
        int[] selectedRow = input[row];
        for (int number : selectedRow) {
            sum += number;
        }
        return sum;
    }

    public int colSum(int[][] input, int column) {
        int sum = 0;
        for (int[] row : input) {
            int number = row[column];
            sum += number;
        }
        return sum;
    }


}
