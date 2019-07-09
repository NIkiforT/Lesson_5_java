package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal[] arrayOfAnimals = new Animal[3];

        arrayOfAnimals[0] = new Cat("Барсик");
        arrayOfAnimals[1] = new Dog("Мухтар");
        arrayOfAnimals[2] = new SuperCat("Иван", 3);



        //ЗАдание 5. Создаем миску и заполняем ее.
        Miski miska1 = new Miski("Миска1", 34);
        miska1.fillMiski(19);
        miska1.fillMiski(30);
        miska1.infoMiski();


        // Создаем кота. В классах Cat и SuperCat добавляем параметр аппетит и метод поесть.
        SuperCat Cat1 = new SuperCat("Вася", 3);

        //Кот ест из Миски (Напримере, кот вася из миски1
        Cat1.eat(miska1);


        //создаем массив котов
        SuperCat[] arrayOfCat = new SuperCat[3];

        arrayOfCat[0] = new SuperCat("Муся", 2);
        arrayOfCat[1] = new SuperCat("Вискас", 7);
        arrayOfCat[2] = new SuperCat("Борис", 8);


        // Коты едят поочереди из одной миски.
        for(SuperCat catt : arrayOfCat){
            catt.eat(miska1);
            catt.InfoEat();
        }


    }
}
