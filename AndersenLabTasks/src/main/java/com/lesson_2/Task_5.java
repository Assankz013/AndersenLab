package com.lesson_2;

public class Task_5 {
    public static int[] ReplaceZerosAndOnes(int [] a){
        for (int i = 0;i<a.length;i++){
            if (a[i]==0){
                a[i]=1;
            }
            else if(a[i]==1){
                a[i]=0;
            }
            else
                System.out.println("Array must have only 0 and 1");
        }
        return a;
    }
}
