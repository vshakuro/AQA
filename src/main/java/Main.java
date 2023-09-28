package main.java;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox01 = new Box<>();
        Box<Apple> appleBox02 = new Box<>();
        Box<Orange> orangeBox01 = new Box<>();
        Box<Orange> orangeBox02 = new Box<>();

        appleBox01.addFruit(new Apple(), 30);
        appleBox02.addFruit(new Apple(), 30);
        orangeBox01.addFruit(new Orange(), 30);
        orangeBox02.addFruit(new Orange(), 20);

        System.out.println("Вес первой коробки с яблоками - " + appleBox01.getWeight());
        System.out.println("Вес второй коробки с яблоками - " + appleBox02.getWeight());
        System.out.println("Вес первой коробки с апельсинами - " + orangeBox01.getWeight());
        System.out.println("Вес второй коробки с апельсинами - " + orangeBox02.getWeight() + "\n");

        System.out.println("Вес первой коробки с яблоками равен весу " +
                "второй коробки с яблоками - " + appleBox01.compare(appleBox02));
        System.out.println("Вес первой коробки с яблоками равен весу " +
                "первой коробки с апельсинами - " + appleBox01.compare(orangeBox01));
        System.out.println("Вес второй коробки с яблоками равен весу " +
                "второй коробки с апельсинами - " + appleBox02.compare(orangeBox02) + "\n");

        System.out.println("Пересыпаем яблоки из первой коробки во вторую");
        appleBox01.transferTo(appleBox02);
        System.out.println("Пересыпаем апельсины из второй коробки в первую" + "\n");
        orangeBox02.transferTo(orangeBox01);

        System.out.println("Вес первой коробки с яблоками - " + appleBox01.getWeight());
        System.out.println("Вес второй коробки с яблоками - " + appleBox02.getWeight());
        System.out.println("Вес первой коробки с апельсинами - " + orangeBox01.getWeight());
        System.out.println("Вес второй коробки с апельсинами - " + orangeBox02.getWeight());
    }
}