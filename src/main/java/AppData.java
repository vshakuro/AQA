package main.java;

import java.io.*;
class AppData {
    private String[] header;
    private int[][] data;
    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }
    public void writeInFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("demo.csv"))) {
            for (int i = 0; i < header.length; i++) {
                writer.write(header[i]);
                if (i < header.length - 1){
                    writer.write(";");
                }
            }
            writer.newLine();
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    writer.write(String.valueOf(data[i][j]));
                    if (j < data[i].length - 1){
                        writer.write(";");
                    }
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readFromFile () {
        try (BufferedReader reader = new BufferedReader(new FileReader("demo.csv"))) {
            String readResult;
            while((readResult = reader.readLine()) != null){
                System.out.println(readResult);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}