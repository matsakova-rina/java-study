package com.java.practice.task01;

public class ArraySorter {
    public void bubbleSortWithFor(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int minValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = minValue;
                }
            }
        }
    }

    // todo fix method
    public void bubbleSortWithWhile(int[] array) {
        boolean isSorted = true;

        while (isSorted) {
            isSorted = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = true;
                }
            }
        }
    }

    public void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && key < array[j]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--;
            }
        }
    }

    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minValueIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minValueIndex]) {
                    minValueIndex = j;
                }
            }

            int minValue = array[minValueIndex];
            array[minValueIndex] = array[i];
            array[i] = minValue;
        }
    }
}

