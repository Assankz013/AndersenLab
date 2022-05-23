package com.lesson_2;
import java.util.Arrays;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr [] = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ReplaceZerosAndOnes(arr)));

    }
    public static int[] ReplaceZerosAndOnes(int [] a){
        for (int i = 0;i<a.length;i++){
            if (a[i]==0){
                a[i]=1;
            }
            else if(a[i]==1){
                a[i]=0;
            }
            else{
                System.out.println("Array must have only 0 and 1");
            }
        }
        return a;
    }
}
