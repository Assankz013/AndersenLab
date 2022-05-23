package com.lesson_2;
import java.util.Arrays;
import java.util.Scanner;
public class Hardest {
    private static void rightShiftArray(int[] a, int n) {
        int k = n % a.length;
        int b [] = Arrays.copyOf(a,a.length);
        for (int i = 0;i<a.length;i++){
                a[(i+k)%a.length] = b[i];

        }
    }
    private static void leftShiftArray(int[] a, int n) {
        int k = n % a.length;
        int b [] = Arrays.copyOf(a,a.length);
        for (int i = 0;i<a.length;i++){
            a[(i-k)%a.length] = b[i];

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int a [] = new int[len];
        for (int i = 0;i<len;i++){
            a[i] = in.nextInt();
        }
        int n = in.nextInt();
        if ((n>0) && (n%a.length!=0)){
            rightShiftArray(a,n);
            System.out.println(Arrays.toString(a));}
        else if ((n<0)&&(n%a.length!=0)){
            leftShiftArray(a,n);
            System.out.println(Arrays.toString(a));
        }
        else
            System.out.println("Array has no changes");
    }



}