package main.java;

public class Main {
    public static void main(String[] args) {
         System.out.println(checkSum(5,5));
         checkMark(5);
         System.out.println(checkNegativeMark(-5));
         writeString("String",2);
         System.out.println(checkYear(2020));
         changeArray();
         fillArrayWithHundredNumbers();
         multipleNumbers();
         createSquareArray();
         createArrayWithInitialValue(5, 50);
    }
    public static boolean checkSum (int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        if (result >= 10 && result <= 20) {
            return true;
        }
        else
            return false;
    }
    public static void checkMark (int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else
            System.out.println("Число отрицательное");
    }
    public static boolean checkNegativeMark (int number) {
        if (number < 0) {
            return true;
        }
        else
            return false;
    }
    public static void writeString (String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }
    public static boolean checkYear (int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
            return true;
        }
            else
                return false;
        }
    public static void changeArray () {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void fillArrayWithHundredNumbers () {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
            if (arr[i] % 10 == 0){
                System.out.println();
            }
        }
    }
    public static void multipleNumbers () {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void createSquareArray () {
        int [][] arr = new int [5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, k = arr[i].length - 1; j < arr[i].length; j++, k--) {
                if (i == j || i == k) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void createArrayWithInitialValue (int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
    }
    }