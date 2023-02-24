package edu.skypro;

public class Task4 {
    /*Даны 2 целых числа a и b, верните их сумму. Если сумма двух чисел
    равна значению в диапазоне от 13 до 19 включительно, то верните 19.
    teenSum(3, 4) → 7
    teenSum(10, 13) → 19
    teenSum(13, 2) → 19*/
    public static void main(String[] args) {
        System.out.println("teenSum(3, 4) = " + teenSum(3, 4));
        System.out.println("teenSum(10, 13) = " + teenSum(10, 13));
        //В условии "teenSum(10, 13) → 19" я так понял это опечатка в задании, т.к. тут вернется 23
        System.out.println("teenSum(13, 2) = " + teenSum(13, 2));
    }

    static int teenSum(int a, int b) {
        int c = a + b;
        if (c >= 13 && c <= 19) {
            return 19;
        }
        return c;
    }
}
