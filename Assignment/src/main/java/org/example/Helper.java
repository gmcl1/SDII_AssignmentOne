package org.example;

public class Helper {

    public static void printArray(int[] input) {
        String output = "[";
        for (int i = 0; i < input.length; i++) {
            if (i == input.length - 1) output += input[i] + "]";
            else output += input[i] + ",";
        }
        System.out.println(output);
    }

}
