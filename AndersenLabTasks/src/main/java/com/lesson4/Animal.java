package com.lesson4;

public class Animal {
    private String name;
    protected static int count = 0;

    public Animal(String name) {
        this.name = name;
        ++count;
    }

    public Animal() {
        this.name = "Animal";
        ++count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    public void swim(int n){
        System.out.println("Животное плыл " + n);
    }
    public void run(int k ){
        System.out.println("Животное пробежал " + k);
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
