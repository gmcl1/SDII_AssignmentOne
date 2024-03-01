package org.example.questions;


public class Question8 {

    public Question8() {
        int[][] input = new int[][]{
                {3, 4, -1, -1},
                {5, 0, -2, -3}
        };
        System.out.println(isColOddDec(input));
    }

    public static boolean isColOddDec(int[][] input) {
        int[] sums = new int[input[0].length];
        boolean dec = true;

        for (int col = 0; col < input[0].length; col++) {
            int sum = 0;
            for (int[] row : input) {
                if (row[col] % 2 != 0)
                    sum += row[col];
            }
            sums[col] += sum;
        }

        for (int i = 0; i < sums.length; i++) {
            if (i != sums.length - 1 && sums[i] <= sums[i + 1]) {
                dec = false;
                break;
            }
        }

        return dec;
    }

}
