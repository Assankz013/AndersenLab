package com.lesson4;

public class Cat extends Animal {
    private static final int RUN_LIMIT = 200;
    private static int catCount = 0;
    private int appetite;
    private boolean isFull = false;

    public static int getCatCount() {
        return catCount;
    }

    public Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
    }

    public Cat(String name) {
        super(name);
        ++catCount;
    }

    public Cat() {
        ++catCount;
    }

    @Override
    public void run(int k) {
        System.out.println((k<=RUN_LIMIT)?(super.getName() + " пробежал " + k):(" Расстояние превышает лимит " + RUN_LIMIT));

    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public void eat(Plate p) {
        if(p.getFood()>=this.appetite){
            p.decreaseFood(this.appetite);
            this.isFull = true;
        }
        else
            this.isFull = false;
    }

   public void info(){
       System.out.println(this.getName() + " is " + this.isFull);
   }
    @Override
    public void swim(int n) {
        System.out.println("Кот не умеет плавать");
    }
}
