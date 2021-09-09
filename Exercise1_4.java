package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] array = {{12, 11, -13, -8}, {-2, 1, 3, 1}};
        int countNegative = 0;
        int countPositive = 0;
        int zero = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    ++countPositive;
                } else if (array[i][j] < 0) {
                    ++countNegative;
                } else {
                    ++zero;
                }
            }

        }

        if (countPositive > countNegative) {
            System.out.println("Положительных чисел в массиве больше.");
        } else if (countPositive == countNegative) {
            System.out.println("Количество отрицательных и положительных чисел в массиве равно.");
        } else {
            System.out.println("Отрицательных чисел в массиве больше.");
        }
    }
}

