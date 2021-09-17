package com.pattern;

public class PascalTriangle {
    public static void printPascalTriangle(int row) {
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            int c = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(c + " ");
                c = c * (i - k) / k;
            }
            System.out.println();
        }
    }
}
