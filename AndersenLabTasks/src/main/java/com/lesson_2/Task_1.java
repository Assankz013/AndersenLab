package com.lesson_2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Task 1");
        System.out.println("Insert two integer numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(checkSumOfIntegers(a,b));}
    public static boolean checkSumOfIntegers(int a,int b){
        if(((a + b) >= 10) && ((a + b) <= 20)){
            return true;
        }
        return false;
    }
}
