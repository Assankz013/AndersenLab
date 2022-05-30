package com.lesson4;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 = new Dog("Barsik");
        Cat cat = new Cat("Mursik");
        cat.run(15);
        cat.run(10);
        cat.swim(1000);
        System.out.println(Dog.getDogCount());
        System.out.println(Cat.getCatCount());
        System.out.println(Animal.count);

    }
}
