package com.company;

public class SuperCat extends Cat {
    public SuperCat (String name, double appetite){
        super(name);
        this.appetite = appetite;
    }
    protected boolean fullCat = false;

    //метод поедания из миски
    public void eat (Miski nameMiski) {
        this.appetite = appetite;
        if (nameMiski.volume >= appetite) {
            nameMiski.volume -= appetite;
            fullCat = true;
            System.out.println(this.name + " покушал! Миска опустела на " + appetite + " литров. Сецчас в ней " + nameMiski.volume);
        } else {
            System.out.println("Не удалось поесть из этой миски");
            System.out.println("Необходимо пополнить миску");

        }
    }

     public void InfoEat() {
         if (fullCat) {
             System.out.println(this.name + " сыт");
         } else {
             System.out.println(this.name + " не поел");
         }
     }


}
