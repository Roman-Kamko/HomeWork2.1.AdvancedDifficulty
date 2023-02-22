package edu.skypro;

public class Task5 {
    /*Учитывая массив целых чисел, верните true, если массив содержит
      две семерки рядом друг с другом или есть две семерки, разделенные
      одним элементом, например, с {7, 1, 7}.
      has77([1, 7, 7]) → true
      has77([1, 7, 1, 7]) → true
      has77([1, 7, 1, 1, 7]) → false*/
    public static void main(String[] args) {
        int[] arr1 = {1, 7, 7};
        System.out.println("has77([1, 7, 7]) = " + has77(arr1));
        int[] arr2 = {1, 7, 1, 7};
        System.out.println("has77([1, 7, 1, 7]) = " + has77(arr2));
        int[] arr3 = {1, 7, 1, 1, 7};
        System.out.println("has77([1, 7, 1, 1, 7]) = " + has77(arr3));
    }

    static boolean has77(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 7 && i != arr.length - 1) {
                if (arr[i + 1] == 7 || arr[i + 2] == 7) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
