package algorithms.sorts.insertionsort;

import java.util.Arrays;

public class InsertionSort {
    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j > -1 && temp < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }


    public static void main(String[] args) {
        int[] numbers = {4, 2, 6, 5, 1, 3};
        insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
