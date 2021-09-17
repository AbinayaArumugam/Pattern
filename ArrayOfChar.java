package com.pattern;

public class ArrayOfChar {
    public static void printCharPattern(char[] arr,int size){
      for(int i=0,j=size-1;i<=j;i++,j--) {
          if (i != j) {
              System.out.print(arr[i] + " " + arr[j]);
          } else {
              System.out.print(arr[i] + " ");
          }
          System.out.println();
      }

      int k=size/2;
      for(int i=k-1,j=k+1;i<j&&j<size&&i>=0;i--,j++){
          if(i!=j){
              System.out.print(arr[i] + " " + arr[j]);
          }
          System.out.println();
      }
    }
}
