package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();

        boolean compareValueResult = compareValue(3, 6);
        System.out.println("Результат задания 5: " + compareValueResult);

        meaningValue(0);

        boolean negativeValue = isNegativeValue(0);
        System.out.println("Результат задания 7: " + negativeValue);

        stringNumber("Print String", 5);

        boolean leapYear = isLeapYear(2000);
        System.out.println("Результат задания 9: " + leapYear);

        int[] task10Arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив для задания 10: " + Arrays.toString(task10Arr));
        integerArray(task10Arr);
        System.out.println("Преобразованный массив задания 10: " + Arrays.toString(task10Arr));

        int[] task11Arr = new int[100];
        fillArray(task11Arr);
        System.out.println("Заполненный массив задания 11: " + Arrays.toString(task11Arr));

        int[] task12Arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив для задания 12: " + Arrays.toString(task12Arr));
        multiplyArray(task12Arr);
        System.out.println("Преобразованный массив задания 12: " + Arrays.toString(task12Arr));

        int[][] task13Arr = new int[5][5];
        diagonalArray(task13Arr);
        System.out.println("Преобразованный массив задания 13");
        for (int i = 0; i < task13Arr.length; i++) {
            System.out.println(Arrays.toString(task13Arr[i]));
        }

        int[] task14Arr = createArray(5, 7);
        System.out.print("Результат задания 14: " + Arrays.toString(task14Arr));
    }

    // Задание 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Задание 2
    public static void checkSumSign() {
        int a = 1;
        int b = 2;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Задание 3
    public static void printColor() {
        int value = 5;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    // Задание 4
    public static void compareNumbers() {
        int a = 2;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // Задание 5
    public static boolean compareValue(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // Задание 6
    public static void meaningValue(int a) {
        if (a >= 0) {
            System.out.println("положительное число");
        } else {
            System.out.println("отрицательное число");
        }
    }

    // Задание 7
    public static boolean isNegativeValue(int a) {
        return a < 0;
    }

    // Задание 8
    public static void stringNumber(String message, int countPrint) {
        for (int i = 0; i < countPrint; i++) {
            System.out.println(message);
        }
    }

    // Задание 9
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Задание 10
    public static void integerArray(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0) {
                ints[i] = 1;
            } else if (ints[i] == 1) {
                ints[i] = 0;
            }
        }
    }

    // Задание 11
    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    // Задание 12
    public static void multiplyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }

    // Задание 13
    public static void diagonalArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
    }

    // Задание 14
    public static int[] createArray(int len, int initialValue) {
        int[] resultArr = new int[len];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = initialValue;
        }

        return resultArr;
    }
}