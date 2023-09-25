package main.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] cars = {"BMW","Mercedes","Mercedes","Volkswagen",
                "Audi","Audi","GMC","GMC",
                "Ford","Dodge","Ferrari","Lamborghini",
                "Renault","Pontiac","Nissan","Toyota",};
        Set<String> uniqueCars = new LinkedHashSet<>(Arrays.asList(cars));
        Map<String, Integer> carsFrequency = new HashMap<>();
        for (String uniqueCar : uniqueCars){
            carsFrequency.put(uniqueCar, Collections.frequency(List.of(cars), uniqueCar));
        }
        System.out.println("Уникальные машины: " + uniqueCars);
        System.out.println(carsFrequency);
    }
}