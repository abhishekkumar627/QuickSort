package com.abhishek.QuickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int intArray[] = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Before Quick Sort: " + Arrays.toString(intArray));
        quickSort(intArray, 0, intArray.length);
        System.out.println("After Quick Sort: " + Arrays.toString(intArray));
    }

    private static void quickSort(int[] intArray, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int partition = partition(intArray, start, end);
        quickSort(intArray, start, partition);
        quickSort(intArray, partition + 1, end);
    }


    //{20, 35, -15, 7, 55, 1, -22};
    private static int partition(int[] intArray, int start, int end) {
        int pivot = intArray[start];
        int i = start;
        int j = end;
        while (i < j) {
            while (i < j && intArray[--j] >= pivot) ;
            if (i < j) {
                intArray[i] = intArray[j];
            }
            while (i < j && intArray[++i] <= pivot) ;
            if (i < j) {
                intArray[j] = intArray[i];
            }
        }
        intArray[j] = pivot;
        return j;
    }
}