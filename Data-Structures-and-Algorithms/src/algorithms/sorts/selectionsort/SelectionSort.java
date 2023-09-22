package algorithms.sorts.selectionsort;

import java.util.Arrays;

public class SelectionSort {
    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 4, 3, 2};
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
