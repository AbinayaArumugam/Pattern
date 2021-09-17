package com.pattern;

public class DiamondNumberPattern {
    public static void printDiamondNumber(int row) {
        int z = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = row - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = z; k >=1; k--) {
                System.out.print(Math.abs(k - i) + 1);
            }
            z += 2;
            System.out.println();
        }
          z-=3;
        for (int i = row; i >=1; i--) {
            for (int j = i; j<=row; j++) {
                System.out.print(" ");
            }
            for (int k = z; k >1; k--) {
                System.out.print(Math.abs(k - i) +1);
            }
            z-=2;
            System.out.println();
        }
    }
}
