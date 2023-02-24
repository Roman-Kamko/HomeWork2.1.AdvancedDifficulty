package edu.skypro;

public class Task6 {
    /*Учитывая массив целых чисел, вернуть true, если в нем
    содержатся одна или несколько пар двоек. Если массив
    содержит одну двойку, то вернуть false.
    twoTwo([4, 2, 2, 3]) → true
    twoTwo([2, 2, 4]) → true
    twoTwo([2, 2, 4, 2]) → false*/
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 2, 3};
        System.out.println("twoTwo([4, 2, 2, 3]) = " + twoTwo(arr1));
        int[] arr2 = {2, 2, 4};
        System.out.println("twoTwo([2, 2, 4]) = " + twoTwo(arr2));
        int[] arr3 = {2, 2, 4, 2};
        System.out.println("twoTwo([2, 2, 4, 2]) = " + twoTwo(arr3));
    }

    static boolean twoTwo(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                count++;
            }
        }
        if (count != 0 && count % 2 == 0) {
            return true;
        }
        return false;
    }
}
