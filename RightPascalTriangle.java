package com.pattern;

public class RightPascalTriangle {
    public static void printRightPascalTriangle(int row){
        for(int i=1;i<=row;i++){
            for(int k=1;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=row-1;i>=0;i--){
            for(int k=1;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
