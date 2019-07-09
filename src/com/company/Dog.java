package com.company;

public class Dog extends Animal {
    public Dog (String name){
        super("Собака " + name);
        this.runLimit = 500;
        this.jumpLimit = 0.5;
        this.swimLimit = 10;
    }
}
