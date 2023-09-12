package main.java.Animals;

public class Dog extends main.java.Animals.Animal {
    public String name;
    public static int dogsCounter;
    public Dog(String name){
        this.name = name;
        dogsCounter++;
    }
    @Override
    public void run(int barrierLength) {
        if (barrierLength > 0) {
            if (barrierLength <= 500 ){
                System.out.println("Собака " + name + " пробежала " + barrierLength + " метров");
            }
            else {
                System.out.println("Собаки столько не бегают" + " (" + barrierLength + ")");
            }
        } else {
            System.out.println("Количество метров не может быть меньше или равным 0" + " (" + barrierLength + ")");
        }
    }
    @Override
    public void swim(int barrierLength) {
        if (barrierLength > 0){
            if (barrierLength <= 10 ){
                System.out.println("Собака " + name + " проплыла " + barrierLength + " метров");
            }
            else {
                System.out.println("Собаки столько не плавают" + " (" + barrierLength + ")");
            }
        } else {
            System.out.println("Количество метров не может быть меньше или равным 0" + " (" + barrierLength + ")");
        }
    }
}
