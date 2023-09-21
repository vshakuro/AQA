package main.java;

public class Main {
    public static void main(String[] args) {

        String[][] correctArray = {
                {"5","5","5","5"},
                {"5","5","5","5"},
                {"5","5","5","5"},
                {"5","5","5","5"}};


        String[][] incorrectColumnsArray = {
                {"2","2","2","2","2"},
                {"2","2","2","2","2"},
                {"2","2","2","2","2"},
                {"2","2","2","2","2"}
        };

        String[][] incorrectRowsArray = {
                {"3","3","3","3"}
        };

        String[][] incorrectTypeArray = {
                {"9","9","9","9"},
                {"9","9","Java","9"},
                {"b","9","a","9"},
                {"9","9","qwe","9"}
        };

        try {
            System.out.println("Сумма элементов массива - " + convertArray(correctArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Сумма элементов массива - " + convertArray(incorrectColumnsArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Сумма элементов массива - " + convertArray(incorrectRowsArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Сумма элементов массива - " + convertArray(incorrectTypeArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int convertArray (String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        for (int i = 0 ; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Некорректные данные в ячейке "+  i + j);
                }
            }
        }
        return sum;
    }
}