package com.company;

public class Cat extends Animal {
    public Cat (String name){
        super("Кот " + name);
        this.runLimit = 200;
        this.jumpLimit = 2;

        //аппетит


    }
    protected double appetite = 0;

    public void swim ( int distance){
        System.out.println(name + " не умеет плавать!");
    }
}
