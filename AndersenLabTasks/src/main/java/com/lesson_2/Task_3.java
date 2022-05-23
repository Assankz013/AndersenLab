package com.lesson_2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(isPositiveNumber(a));
    }

    public static boolean isPositiveNumber(int a){
        return (a >= 0);
    }
}
