package main.java;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;
    public Employee(String name, String position, String email, String phoneNumber, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber= phoneNumber;
        this.salary = salary;
        this.age = age;

    }
    public void print() {
        System.out.println("Имя - " + name + "\nДолжность - " + position + "\nemial - " + email + "\nТелефон - " + phoneNumber + "\nЗарплата - "+ salary + "\nВозраст - " + age + "\n");
    }
    public static void main(String[] args) {
        Employee[] personArray = new Employee[5];
        personArray[0] = new Employee("Иванов Иван Иванович", "Директор","Ivanov@gmail.com","8-800-555-35-35", 999, 50);
        personArray[1] = new Employee("Петров Петр Петрович", "Заместитель","Petrov@gmail.com","8-800-555-35-35", 777, 40);
        personArray[2] = new Employee("Сидоров Сидор Сидорович", "Бухгалтер","Sidorov@gmail.com","8-800-555-35-35", 555, 30);
        personArray[3] = new Employee("Михайлов Михаил Михайлович", "Менеджер","Mihailov@gmail.com","8-800-555-35-35", 333, 20);
        personArray[4] = new Employee("Григорьев Григорий Григорьевич", "Работник","Grigoriev@gmail.com","8-800-555-35-35", 111, 18);
        for (Employee personArrayTemporaryPointer : personArray){
            personArrayTemporaryPointer.print();
        }
    }
}