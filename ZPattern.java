package com.pattern;

public class ZPattern {
    public static void printZPattern(int size){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==0|i==size-1||j==size-i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
