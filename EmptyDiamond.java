package com.pattern;

public class EmptyDiamond {
    public static void printDiamond(int row){
       int x=row/2+1;
       for(int i=1;i<=row;i++){
           for(int j=1;j<=row;j++){
               if(j==x||j==row-x+1){
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           if(i<=row/2)
               x--;
           else
               x++;
           System.out.println();
           }
       }
    }


/* int x,y;
        x=y=row;
        for(int i=1;i<row;i++){
            for(int j=1;j<row*2;j++){
                if(j==x||j==y){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
                x--;
                y++;
                System.out.println();
        }
        for(int i=row;i>=1;i--){
            for(int j=1;j<row*2;j++){
                if(j==x||j==y){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            x++;
            y--;
            System.out.println();
        }

 */