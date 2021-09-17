package com.pattern;

public class Triangle {
    public static void printTriangle(int row){
        int x=row;
        int y=row;
     for(int i=1;i<=row;i++){
         for(int j=1;j<row*2;j++){
             if(j==x||j==y||i==row){
                 System.out.print("*");
             } else{
                 System.out.print(" ");
             }
         }
         x--;
         y++;
         System.out.println();
     }
    }
}
