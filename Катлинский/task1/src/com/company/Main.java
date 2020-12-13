package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        int value = s.nextInt();

        if (value > 7)
            System.out.println("Привет");
    }
}