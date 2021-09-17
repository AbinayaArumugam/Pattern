package com.pattern;

public class SpiralModification {
    public static void printSpiral(int size){
        int[][] mat=new int[size][size];
        int top=0;
        int down=size-1;
        int left=0;
        int right=size-1;
        int c=1;
        while(true){

            for(int i=left;i<=right;++i){
                mat[top][i]=c++;
            }
            top++;
            if(top>down||left>right){
                break;
            }
            for(int i=top;i<=down;++i){
                mat[i][right]=c++;
            }
            right--;
            if(top>down||left>right){
                break;
            }
            for(int i=right;i>=left;--i){
                mat[down][i]=c++;
            }
            down--;
            if(top>down||left>right){
                break;
            }
            for(int i=down;i>=top;--i){
                mat[i][left]=c++;
            }
            left++;
            if(top>down||left>right){
                break;
            }
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
