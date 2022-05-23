package com.lesson_2;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        printSignOfNumber(x);
    }

    public static void printSignOfNumber(int a){
        System.out.println((a >= 0) ? "Положительный" : "Отрицательный");
    }
}
