package main.java;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> randomNumbers = new ArrayList<>();
        int number;
        Random rnd = new Random();
        for (int i=0; i<10; i++) {
            number = rnd.nextInt(100);
            randomNumbers.add(number);
        }
        Stream<Integer> intStream = randomNumbers.stream();
        Predicate<Integer> evenNumbers;
        evenNumbers = (n) -> (n % 2) == 0;
        Stream<Integer> resStream = intStream.filter(evenNumbers);
        System.out.println("Список сгенерированных чисел" + "\n" + randomNumbers);
        System.out.println("Количество четных чисел - " + resStream.count() + "\n");

        List<String> elements = Arrays.asList("Highload","High","Load","Highload");
        System.out.println("Коллекция - " + elements);
        System.out.println("Слово \"High\" встречается в коллекции " +
                elements.stream().filter("High"::equals).count() + " раз");
        System.out.println("На первом месте в коллекции находится элемент - " +
                elements.stream().findFirst().orElse("0"));
        System.out.println("На последнем месте в коллекции находится элемент - " +
                elements.stream().reduce((first, second) -> second).orElse("0") + "\n");

        List<String> list = Arrays.asList("f10", "f15", "f2", "f4", "f4");
        Collections.sort(list);
        String[] arr = new String[list.size()];
        list.toArray(arr);
        System.out.println("Изначальный список - " + list + "\n" +
                "Отсортированный массив - " + Arrays.toString(arr) + "\n");

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> logins = new ArrayList<>();
        System.out.println("Введите различные логины (Будут выведены все логины на букву \"f\")\n" +
                "Чтобы выйти - нажмите Enter");
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            logins.add(input);
            input = scanner.nextLine();
        }
        logins.stream().filter(login -> login.startsWith("f")).forEach(System.out::println);
    }
}