package main.java.Animals;

public class Cat extends main.java.Animals.Animal {
    public String name;
    public static int catsCounter;
    public boolean isHungry = true;
    public int requiredAmountOfFood = 10;

    public Cat(String name) {
        this.name = name;
        catsCounter++;
    }
    @Override
    public void run(int barrierLength) {
        if (barrierLength > 0 ) {
            if (barrierLength <= 200 ){
                System.out.println("Кот " + name + " пробежал " + barrierLength + " метров");
            }
            else
            {
                System.out.println("Коты столько не бегают" + " (" + barrierLength + ")");
            }
        }
        else
        {
            System.out.println("Количество метров не может быть меньше или равным 0" +
                    " (" + barrierLength + ")");
        }
    }
    @Override
    public void swim(int barrierLength) {
        if (barrierLength > 0){
            System.out.println("Коты не плавают");
        }
        else
        {
            System.out.println("Количество метров не может быть меньше или равным 0" +
                    " (" + barrierLength + ")");
        }
    }
    public void feedCat(){
        if (Feeder.foodCounter > 0 && Feeder.foodCounter >= requiredAmountOfFood){
            Feeder.foodCounter -= requiredAmountOfFood;
            isHungry = false;
            System.out.println("Кот " + name + " покормлен "+ "Остаток еды - " + Feeder.foodCounter);
        }
        else
        {
            System.out.println("Не удалось покормить кота " +
                    name + ", потому что недостаточно еды в тарелке " +
                    "(" + Feeder.foodCounter + ")");
        }
    }

    public boolean isHungry() {
        return isHungry;
    }
}
