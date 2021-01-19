package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите число:");
        parser();
    }

    public static void parser() {
        Scanner s = new Scanner(System.in);
        Double value = null;
        boolean flag = true;
        while (flag) {
            try {
                value = Double.parseDouble(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод данных! \n Введите число:");
                continue;
            }
            if (value > Double.MAX_VALUE || value < (Double.MIN_VALUE)) {
                System.out.println("Введенное Вами число находится за пределами double \n Попробуйте ещё раз:");
                continue;
            }
            flag = false;

        }
        sayHello(value);

    }

    public static void sayHello(double value){
        if (value > 7) {
            System.out.println("Привет");
        }
    }

}