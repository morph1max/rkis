package ru.sfu;

import java.util.Scanner;

public class Inputs {

    // Метод для ввода целого числа
    public static int inputInt(String inputName) {
        System.out.println("Введите " + inputName + " = ");
        Scanner scan = new Scanner(System.in);
        int num;

        while (true) {
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                scan.nextLine();
                return num;
            }
            else {
                System.out.println("Вводится не число!");
                scan.nextLine();
            }
        }
    }

    // Метод для ввода строки
    public static String inputStr(String inputName) {
        System.out.println("Введите " + inputName + " = ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
