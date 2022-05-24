package com.lesson3;


public class Employee {
    public final static int MAX_AGE = 120;
    private String name;
    private String surname;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String surname, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if((age < MAX_AGE) && (0 < age)) {
            this.age = age;
        } else
            System.out.println("Incorrect data");
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name='" + this.getName() + '\'' +
                ", surname='" + this.surname + '\'' +
                ", position='" + this.position + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", phoneNumber='" + this.getPhoneNumber() + '\'' +
                ", salary=" + this.salary +
                ", age=" + this.getAge() +
                '}';
    }
}
