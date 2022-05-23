package com.lesson_2;
import java.util.Scanner;
public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a [] [] = new int[n][n];
        fillMatrixDiagonal(a);
        for (int i  = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void fillMatrixDiagonal(int a [] []){
        for (int i  = 0;i<a.length;i++){
            for (int j = 0;j<a[i].length;j++){
                if ((i+j==(a[i].length-1)) || (i==j)){
                    a[i][j] = 1;
                }
            }}
    }
}
