package main.java;

import java.util.*;

public class Phonebook {
    static Map<String, String> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.addSubscriber("+8-800-555-35-35", "Иванов Иван Иванович");
        phonebook.addSubscriber("+8-800-555-36-36", "Иванов Иван Иванович");
        phonebook.addSubscriber("+8-800-555-37-37", "Иванов Иван Иванович");
        phonebook.addSubscriber("+8-800-555-38-38","Петров Петр Петрович");
        phonebook.addSubscriber("+8-800-555-39-39","Сидоров Сидор Сидорович");

        String phones;
        for (String name : Arrays.asList("Иванов Иван Иванович",
                "Петров Петр Петрович",
                "Сидоров Сидор Сидорович",
                "Романов Роман Романович")) {
            phones = String.join(", ", phonebook.getPhoneByName(name));
            System.out.println(name + " - " + (!phones.isEmpty() ? phones : "Такого абонента не существует"));
        }
    }
    public void addSubscriber(String number, String name) {
        phoneBook.put(number, name);
    }
    public ArrayList<String> getPhoneByName(String name) {
        ArrayList<String> phones = new ArrayList<>();
        for (String phone : phoneBook.keySet()) {
            if (phoneBook.get(phone).equals(name)) {
                phones.add(phone);
            }
        }
        return phones;
    }
}