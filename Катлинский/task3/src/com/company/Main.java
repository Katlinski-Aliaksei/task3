package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число " + (i + 1));
            array[i] = s.nextInt();
        }
        for (int i : array) {
            if (i % 3 == 0)
                System.out.println(i);
        }

    }
}
