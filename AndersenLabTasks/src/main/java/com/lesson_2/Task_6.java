package com.lesson_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int ARRAY_SIZE = 100;
        int x [] = new int[ARRAY_SIZE];
        fillArrayFromZeroToHundred(x);
        for (int i = 0;i<100;i++){
            System.out.print(x[i] + " ");
        }

    }
    public static void fillArrayFromZeroToHundred(int a []){
        for (int i = 0;i<100;i++){
            a[i] = i+1;
        }

    }
}
