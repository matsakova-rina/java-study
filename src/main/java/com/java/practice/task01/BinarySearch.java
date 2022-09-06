package com.java.practice.task01;

public class BinarySearch {
    public int runIterativeBinarySearch(int[] sortedArray, int key, int lowIndex, int highIndex) {

        int index = Integer.MAX_VALUE;

        while (lowIndex <= highIndex) {
            int midIndex = lowIndex + ((highIndex - lowIndex) / 2);
            if (sortedArray[midIndex] < key) {
                lowIndex = midIndex + 1;
            } else if (sortedArray[midIndex] > key) {
                highIndex = midIndex - 1;
            } else if (sortedArray[midIndex] == key) {
                index = midIndex;
                break;
            }
        }
        return index;
    }
}
