package edu.skypro;

public class Task2 {
    /*В одной компании друзей принято считать вечеринку успешной,
    когда съедено больше от 15 до 20 пачек чипсов. Если вечеринка
    проходит в выходные, то верхней границы количества съеденных
    пачек чипсов нет. Напишите программу, которая возвращает true,
    если переменная с заданными значениями успешна, или false в
    противном случае.
    chipsParty(3, false) → false
    chipsParty(15, false) → true
    chipsParty(70, true) → true*/
    public static void main(String[] args) {
        // Я не очень понял условие задачи особенно "съедено БОЛЬШЕ ОТ 15 до 20"
        System.out.println("chipsParty(3, false) = " + chipsParty(3, false));
        System.out.println("chipsParty(15, false) = " + chipsParty(15, false));
        System.out.println("chipsParty(70, true) = " + chipsParty(70, true));
    }

    static boolean chipsParty (int countChips, boolean areWeekend) {
        if (countChips >= 15 && countChips <= 20 && areWeekend == false) {
          return true;
        } else if (countChips >= 15 && areWeekend == true) {
            return true;
        }
        return false;
    }
}
