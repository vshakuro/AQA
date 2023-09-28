package main.java;

import java.util.*;

public class Box<T extends Fruit> {
    private ArrayList<T> box;

    public Box() {
        this.box = new ArrayList<>();
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T o : box) {
            weight += o.getWeight();
        }
        return weight;
    }

    public void transferTo(Box<? super T> box) {
        box.box.addAll(this.box);
        this.box.clear();
    }

    public void addFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            box.add(fruit);
        }
    }

    public boolean compare(Box<?> other) {
        return this.getWeight() == other.getWeight();
    }
}