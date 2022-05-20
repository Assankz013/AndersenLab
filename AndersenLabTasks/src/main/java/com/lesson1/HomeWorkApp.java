package com.lesson1;

import java.util.Scanner;

public class HomeWorkApp {

    public static void printThreeWords(){
        System.out.println("Orange"+"\n" + "Banana" + "\n" + "Apple");
    }
    public static void checkSumSign(){

        Scanner in = new Scanner(System.in);
        System.out.println("insert a");
        int a = in.nextInt();
        System.out.println("insert b");
        int b = in.nextInt();

        if (a+b>=0){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        Scanner in = new Scanner(System.in);
        System.out.println("insert value to print color");
        int value = in.nextInt();
        if (value<=0){
            System.out.println("Красный");
        }
        else if ((value>0)&&(value<=100)){
            System.out.println("Желтый");
        }
        else{
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        Scanner in = new Scanner(System.in);
        System.out.println("insert a");
        int a = in.nextInt();
        System.out.println("insert b");
        int b = in.nextInt();
        if (a>=b){
            System.out.println("a>=b" + " " + a + " >= " + b);
        }
        else{
            System.out.println("a<b" + " " + a + " < " + b);
        }
    }

    public static void main(String[] args) {
        System.out.println("printThreeWords");
        printThreeWords();
        System.out.println("1 task completed");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");


        System.out.println("checkSumSign");
        checkSumSign();
        System.out.println("2 task completed");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");

        System.out.println("printColor");
        printColor();
        System.out.println("3 task completed");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");

        System.out.println("compareNumbers");
        compareNumbers();
        System.out.println("4 task completed");


    }

}
