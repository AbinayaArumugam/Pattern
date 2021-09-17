package com.pattern;

public class LeftTriangle {
    public static void printLeftTriangle(int row){
        for(int i=1;i<=row;i++){
            for(int j=row-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
