package com.lesson_2;
import java.util.Arrays;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int initialValue = in.nextInt();
        System.out.println(Arrays.toString(fillArrayByInitialValue(len,initialValue)));
    }
    public static int [] fillArrayByInitialValue(int len,int initialValue){
        int arr [] = new int [len];
        for (int i = 0;i<len;i++){
            arr[i] = initialValue;
        }
        return arr;
    }
}