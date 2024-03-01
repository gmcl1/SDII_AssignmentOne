package org.example.questions;

public class Question1 {

    /**
     * 1. Complete the method int array2DMax(int[][] a) that returns the maximum value in
     * the 2d array a and complete the method int array2DMin(int[][] a) that returns the
     * minimum value in the 2d array a. Your solution should work for any size of 2d array.
     * (4 marks – 2 marks for each correctly functioning method).
     * For example, the following array has a maximum value of 8 and a minimum value of -7.
     */

    public Question1() {
        int[][] input = {
                {1, 8, 3},
                {-7, 5, 2},
                {4, 0, 2},
        };
        System.out.println(array2DMax(input));
        System.out.println(array2DMin(input));
    }


    public static int array2DMax(int[][] input) {
        int max = input[0][0];
        for (int[] nums : input) {
            for (int number : nums) {
                if (number > max) max = number;
            }
        }
        return max;
    }

    public static int array2DMin(int[][] input) {
        int min = input[0][0];
        for (int[] nums : input) {
            for (int number : nums) {
                if (number < min) min = number;
            }
        }
        return min;
    }


}
