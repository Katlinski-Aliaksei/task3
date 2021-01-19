package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];
        int max = 200;
        int min = -200;

        System.out.print("Массив имеет вид: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min) + min);
            System.out.print(array[i] + " ");
        }

        System.out.print("\nЭлементы массива кратные 3: ");
        for (int i : array) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
