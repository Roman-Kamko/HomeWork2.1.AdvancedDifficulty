package edu.skypro;

public class Task1 {
    /*Напишите программу, которая меняет местами значения, хранящиеся
    в двух переменных, без использования третьей переменной.*/

    static int a = 2;
    static int b = 3;
    public static void main(String[] args) {
        System.out.println(a + " " + b);

        a += b;
        b = a - b;
        a -= b;

        System.out.println(a + " " + b);
    }
}
