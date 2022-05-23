package com.lesson_2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int n = in.nextInt();
        printString(str,n);
        int year = in.nextInt();
        System.out.println(isLeapYear(year));
    }
    public static void printString(String str,int n){
        for (int i = 0;i<n;i++){
            System.out.println(str);
        }
    }
    public static boolean isLeapYear(int year){
        return (((year % 4) == 0) && ((year % 100) != 0) && ((year % 400) == 0));
    }
}
