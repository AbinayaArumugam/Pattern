package com.pattern;

public class SimpleNumberPattern {
    public static void printNumber(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
