package com.company;

public class Miski {
    protected String name;
    protected double maxVolume = 15;
    protected double volume = 0;

    public Miski () { this.name = "Миска";}

    public Miski (String name) {this.name = name;}

    public Miski (String name, double maxVolume){ this.name = name; this.maxVolume = maxVolume;}

    // метод пополнения миски
    public void fillMiski (int number){
        if(number > 0 && (volume + number) <= maxVolume){
            volume = volume + number;
            System.out.println("Пополнили миску на" + number + " литров");
        }else {
            System.out.println("Не удалось пополнить миску");
        }
    }

    //метод вывода информации
    public void infoMiski(){
        System.out.println("В настоящий момент в миске " + volume + " литров");
        System.out.println(" Мы можем добавить еще " + ( maxVolume - volume) + " литров");
    }
}
