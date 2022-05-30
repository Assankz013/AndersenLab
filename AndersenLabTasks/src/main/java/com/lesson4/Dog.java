package com.lesson4;

public class Dog extends Animal {
    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 10;

    public static int getDogCount() {
        return dogCount;
    }

    private static int dogCount = 0;
    public Dog(String name) {
        super(name);
        ++dogCount;
    }

    public Dog() {
        ++dogCount;
    }

    @Override
    public void swim(int n) {
        System.out.println((n<=SWIM_LIMIT)?(super.getName() + " пробежал " + n):(" Расстояние превышает лимит " + SWIM_LIMIT));
    }

    @Override
    public void run(int k) {
        System.out.println((k<=RUN_LIMIT)?(super.getName() + " пробежал " + k):(" Расстояние превышает лимит " + RUN_LIMIT));
    }

}

