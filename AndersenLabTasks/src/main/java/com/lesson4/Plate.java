package com.lesson4;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if ((this.food - n) > 0){
                this.food -= n;}
        else{
            System.out.println("There is no food ");
        }
    }
    public void addFood(int n){
        this.food+=n;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

}
