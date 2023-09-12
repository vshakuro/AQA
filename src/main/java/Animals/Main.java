package main.java.Animals;

public class Main {
    public static void main(String[] args) {
        main.java.Animals.Dog dogBobik = new main.java.Animals.Dog("Бобик");
        main.java.Animals.Dog dogSharik = new main.java.Animals.Dog("Шарик");
        main.java.Animals.Dog dogTuzik = new main.java.Animals.Dog("Тузик");

        System.out.println();

        dogBobik.run(500);
        dogSharik.run(700);
        dogTuzik.run(-1);

        System.out.println();

        dogBobik.swim(5);
        dogSharik.swim(20);
        dogTuzik.swim(-1);

        main.java.Animals.Cat catBarsik = new main.java.Animals.Cat("Барсик");
        main.java.Animals.Cat catVaska = new main.java.Animals.Cat("Васька");
        main.java.Animals.Cat catMurzik = new main.java.Animals.Cat("Мурзик");

        System.out.println();

        catBarsik.run(200);
        catVaska.run(500);
        catMurzik.run(-1);

        System.out.println();

        catBarsik.swim(200);
        catMurzik.swim(-1);

        System.out.println();

        System.out.println("Количество созданных собак - " + main.java.Animals.Dog.dogsCounter);
        System.out.println("Количество созданных котов - " + main.java.Animals.Cat.catsCounter);
        System.out.println("Общее количество животных - " + (main.java.Animals.Dog.dogsCounter + main.java.Animals.Cat.catsCounter));

        System.out.println();

        main.java.Animals.Feeder catsFeederEmpty = new main.java.Animals.Feeder(0);
        main.java.Animals.Feeder catsFeeder = new main.java.Animals.Feeder(10);
        catsFeeder.feederInfo();
        catsFeeder.addFood(39);
        catsFeeder.feederInfo();

        System.out.println();

        main.java.Animals.Cat[] cats = new main.java.Animals.Cat[5];
        cats[0] = new main.java.Animals.Cat("Барсик");
        cats[1] = new main.java.Animals.Cat("Васька");
        cats[2] = new main.java.Animals.Cat("Мурзик");
        cats[3] = new main.java.Animals.Cat("Дымок");
        cats[4] = new main.java.Animals.Cat("Федька");
        for (main.java.Animals.Cat cat : cats) {
            cat.feedCat();
        }

        for (main.java.Animals.Cat cat : cats) {
            if (cat.isHungry()) {
                System.out.println("Кот " + cat.name + " голодный");
            } else {
                System.out.println("Кот " + cat.name + " не голодный");
            }
        }
    }
}