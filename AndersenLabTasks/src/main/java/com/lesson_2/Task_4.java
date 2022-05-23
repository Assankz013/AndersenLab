package com.lesson_2;

public class Task_4 {
    public static void printString(String str,int n){
        for (int i = 0;i<n;i++){
            System.out.println(str);
        }
    }
    public static boolean isLeapYear(int year){
        return (((year % 4) == 0) && ((year % 100) != 0) && ((year % 400) == 0));
    }
}
