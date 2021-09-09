package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,8,3,8,7};
        int sum = 0;
        int n = 8;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
              continue;
            }
            sum += array[i];
        }
        System.out.print("Sum is: " + sum);

    }
}
