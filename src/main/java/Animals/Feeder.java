package main.java.Animals;

public class Feeder {
    public static int foodCounter;
    public Feeder(int foodCounter){
        this.foodCounter = foodCounter;
        if (foodCounter <= 0){
            System.out.println("Тарелка не может быть пустой\n");
        }
    }
    public void addFood(int amountOfFood){
        foodCounter += amountOfFood;
        System.out.println("Добавлено " + amountOfFood + " еды");
    }
    public void feederInfo(){
        System.out.println("Количество еды в тарелке - " + foodCounter);
    }
}
