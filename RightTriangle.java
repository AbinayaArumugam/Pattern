package com.pattern;

public class RightTriangle {
    public static void printRightTriangle(int row){
        for(int i=0;i<=row;i++){
            for(int k=1;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
