package com.pattern;
import java.util.Scanner;
public class Runner {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args){
      System.out.println("Enter the Question no");
      int question=in.nextInt();
        System.out.println("Enter the number of rows ");
        int row=in.nextInt();
      switch (question){
          case 1:
              PyramidPattern.printPyramid(row);
              break;
          case 2:
              RightTriangle.printRightTriangle(row);
              break;
          case 3:
              LeftTriangle.printLeftTriangle(row);
              break;
          case 4:
              Diamond.printDiamond(row);
              break;
          case 5:
              RightPascalTriangle.printRightPascalTriangle(row);
              break;
          case 6:
              SandGlass.printSandGlass(row);
              break;
          case 7:
              Triangle.printTriangle(row);
              break;
          case 8:
              EmptyDiamond.printDiamond(row);
              break;
          case 9:
              SimpleNumberPattern.printNumber(row);
              break;
          case 10:
              PascalTriangle.printPascalTriangle(row);
              break;
          case 11:
              DiamondNumberPattern.printDiamondNumber(row);
              break;
          case 12:
              AlternatingRectangle.printAlternatingRectangle(row);
              break;
          case 13:
              LookAndSay.printLookAndSay(row);
              break;
          case 14:
              ZPattern.printZPattern(row);
              break;
          case 15:
              SpiralPattern.printSpiral(row,row);
              break;
          case 16:
              SpiralModification.printSpiral(row);
              break;
          case 17:
              char[] arr=new char[row];
              System.out.println("Enter Elements");
              for(int i=0;i<row;i++){
                  arr[i] =in.next().charAt(0);
              }
              ArrayOfChar.printCharPattern(arr,row);
              break;
      }
    }
}
