package com.lesson3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Employee [] employees = new Employee[2];
        for (int i = 0;i<employees.length;i++){
            String name = in.next();
            String surname = in.next();
            String position = in.next();
            String email = in.next();
            String phone = in.next();
            int salary = in.nextInt();
            int age =in.nextInt();
            employees [i] = new Employee(name,surname,position,email,phone,salary,age);
        }

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}