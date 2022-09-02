package com.java.practice.task01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 75, 25, 13, 1, 8};

        ArraySorter arraySorter = new ArraySorter();

        arraySorter.bubbleSortWithFor(arr);
        arraySorter.bubbleSortWithWhile(arr);
        arraySorter.insertionSort(arr);
        arraySorter.selectionSort(arr);


        System.out.println(Arrays.toString(arr));
    }
}
