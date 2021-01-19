package com.company;

import java.lang.invoke.StringConcatException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String name = null;
        boolean flag = true;
        System.out.println("Введите имя");

        while (flag) {
            name = s.nextLine();
            if (name.matches("[а-яА-Яa-zA-Z]+")) {
                flag = false;
            } else {
                System.out.println("Вы ввели некорректное значение имени\n Введите имя еще раз:");
                continue;
            }

        }
        sayHelloSlava(name);
    }

    public static void sayHelloSlava(String name) {

        if (name.equalsIgnoreCase("Вячеслав"))
            System.out.println("Привет, Вячеслав");
        else
            System.out.println("Нет такого имени");

    }
}

