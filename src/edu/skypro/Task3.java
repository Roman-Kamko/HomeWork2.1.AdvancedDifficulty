package edu.skypro;

public class Task3 {
    /*Число 6 поистине великое число. Для двух значений int, a и b, вернуть true,
    если одно из них равно 6. Или если их сумма или разность равна 6.
    great6(6, 4) → true
    great6(4, 5) → false
    great6(1, 5) → true*/

    public static void main(String[] args) {
        System.out.println("great6(6, 4) = " + great6(6, 4));
        System.out.println("great6(4, 5) = " + great6(4, 5));
        System.out.println("great6(1, 5) = " + great6(1, 5));
    }

    static boolean great6(int a, int b) {
        if (a == 6 || b == 6 || Math.abs(a - b) == 6 || Math.abs(a + b) == 6) {
            return true;
        }
        return false;
    }
}
