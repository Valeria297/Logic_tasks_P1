package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] array = {
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
        };

        boolean triangular = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i < j && array[i][j] != 0)
                        || (i >= j && array[i][j] == 0)) {
                    triangular = false;
                    break;
                }
            }

            if (!triangular) {
                break;
            }
        }

        if (triangular) {
            System.out.println("Массив является нижней треугольной матрицей.");
        } else {
            System.out.println("Массив не является нижней треугольной матрицей.");
        }
    }
}
