package com.lesson4;

public class Task2 {
    public static void main(String[] args) {
        Cat [] cats = new Cat[5];
        cats[0] = new Cat("Barsik",25);
        cats[1] = new Cat("Mursik",15);
        cats[2] = new Cat("Boris",35);
        cats[3] = new Cat("Merci",5);
        cats[4] = new Cat("Tanya",30);
        Plate plate = new Plate(100);
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
            System.out.println(plate.getFood());
        }
    }
}
