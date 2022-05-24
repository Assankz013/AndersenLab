package com.lesson3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       /* Scanner in = new Scanner(System.in); - with input from console
        Employee [] employees = new Employee[5];
        for (int i = 0;i<employees.length;i++){
            String name = in.next();
            String surname = in.next();
            String position = in.next();
            String email = in.next();
            String phone = in.next();
            int salary = in.nextInt();
            int age =in.nextInt();
            employees [i] = new Employee(name,surname,position,email,phone,salary,age);
        }*/
        Employee [] employees = new Employee[5];
        employees [0] = new Employee("Assan","Tildabay","QA engineer","assan@mail.ru","87763274791",500000,21);
        employees [1] = new Employee("Vlad","Kim","QA engineer","vl@mail.ru","87773274791",500000,41);
        employees [2] = new Employee("Osman","Omar","FrontEnd developer","osman@mail.ru","87762274791",600000,40);
        employees [3] = new Employee("Zhakha","Bayanov","FrontEnd developer","an@mail.ru","87763274751",500000,21);
        employees [4] = new Employee("Baha","Sybanov","TeamLead","san@mail.ru","87783274791",5000000,51);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}