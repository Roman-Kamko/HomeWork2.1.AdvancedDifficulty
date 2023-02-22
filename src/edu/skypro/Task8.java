package edu.skypro;

import java.util.Scanner;

public class Task8 {
    /*Напишите программу, которая выводит в консоль все положительные
    делители натурального числа, введённого пользователем с клавиатуры.*/

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите натуральное число: ");
        if (sc.hasNextInt()) {
            int inputNum = sc.nextInt();
            if (inputNum > 0) {
                StringBuilder sb = new StringBuilder("Положительные делители для числа " + inputNum + ": ");
                for (int i = 1; i <= inputNum; i++) {
                    if (inputNum % i == 0) {
                        sb.append(i + " ");
                    }
                }
                System.out.println(sb);
            } else {
                printInputError();
            }
        } else {
            printInputError();
        }
    }

    static void printInputError() {
        System.out.println("Не верный ввод!");
    }
}
