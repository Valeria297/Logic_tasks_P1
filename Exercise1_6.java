package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] array1 = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
        int[][] array2 = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };

        int[][] arraySum = new int[3][3];
        for (int i = 0; i < arraySum.length; i++) {
            for (int j = 0; j < arraySum[i].length; j++) {
                arraySum[i][j] = array1[i][j] + array2[i][j];
            }
        }

        int[][] arrayDiff = new int[3][3];           //Diff - difference (разность)
        for (int i = 0; i < arrayDiff.length; i++) {
            for (int j = 0; j < arrayDiff[i].length; j++) {
                arrayDiff[i][j] = array1[i][j] - array2[i][j];
            }
        }

        System.out.println(Arrays.deepToString(arraySum));
        System.out.println(Arrays.deepToString(arrayDiff));
    }
}

