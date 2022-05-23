package com.lesson_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Task 1");
            System.out.println("Insert two integer numbers");
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(Task_1.checkSumOfIntegers(a,b));
            System.out.println("--------------------------------");
        System.out.println("Task 2");
            int x = in.nextInt();
            Task_2.printSignOfNumber(x);
        System.out.println("Task 3");
            int y = in.nextInt();
        System.out.println(Task_3.isPositiveNumber(y));



    }
}
