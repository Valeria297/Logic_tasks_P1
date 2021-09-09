package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233};
        int sum = 0;
        int n = array[11];

        for (int i = 0; i < array.length; i++){
            if (array[i] == n){
                break;
            }

            if (array[i] %2 == 0){
              sum+=array[i];
            }
        }
        System.out.println("Sum is: " + sum);
    }
}
