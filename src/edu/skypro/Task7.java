package edu.skypro;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {
    /*Пользователь должен указать с клавиатуры чётное положительное число, а
    программа должна создать массив указанного размера из случайных целых
    чисел из [-5;5] и вывести его на экран в строку. После этого программа
    должна определить и сообщить пользователю о том, сумма модулей какой
    половины массива больше: левой или правой, либо сообщить, что эти суммы
    модулей равны. Если пользователь введёт неподходящее число, то программа
    должна требовать повторного ввода до тех пор, пока не будет указано
    корректное значение.*/
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    static int[] arr;

    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите длину массива (чётное положительное число): ");
            int size = sc.nextInt();
            if (size > 0 && size % 2 == 0) {
                arr = new int[size];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = random.nextInt(-5, 5);
                }
                System.out.println(Arrays.toString(arr));
                compareHalves(arr);
                break;
            }
            System.out.println("Введено не корректное значение");
        }
    }
    static void compareHalves(int[] arr) {
        int mid = arr.length / 2;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        for (int i = 0; i < mid; i++) {
            sumFirstHalf += Math.abs(arr[i]);
        }
        for (int i = mid; i < arr.length; i++) {
            sumSecondHalf += Math.abs(arr[i]);
        }
        if (sumFirstHalf > sumSecondHalf) {
            System.out.println("Сумма модулей левой половины больше чем правой");
        } else if (sumFirstHalf == sumSecondHalf) {
            System.out.println("Сумма модулей левой и правой половины равны");
        } else {
            System.out.println("Сумма модулей правой половины больше чем левой");
        }
    }
}
