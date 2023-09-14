package main.java;

public class ReadSaveApp {
    public static void main(String[] args) {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{100, 200, 123}, {300, 400, 500}};
        AppData appData = new AppData(header, data);
        appData.writeInFile();
        System.out.println("\nДанные записаны в файл CSV\n");
        System.out.println("Данные, загруженные из CSV файла:");
        appData.readFromFile();
    }
}