package com.company;

public abstract class Animal {
    protected String name;

    protected int runLimit = 0;
    protected double jumpLimit = 0;
    protected int swimLimit = 0;

    public Animal(){ this.name = "Безымянный";}

    public Animal (String name) {this.name = name;}

    public void run (int distance){
        if(runLimit > 0 && distance <= runLimit){
            System.out.println(this.name + " пробежал " + distance + " метров");
        }else {
            System.out.println(this.name + " не сможет пробежать столько");
        }

    }

    public void jump (double height){
        if(jumpLimit > 0 && height <= jumpLimit){
            System.out.println(this.name + " прыгнул на " + height + " метра");
        }else {
            System.out.println(this.name + " не сможет прогнуть столько");
        }

    }

    public void swim (int distance){
        if(runLimit > 0 && distance <= runLimit){
            System.out.println(this.name + " проплыл " + distance + " метров");
        }else {
            System.out.println(this.name + " не сможет проплыть столько");
        }

    }

}
