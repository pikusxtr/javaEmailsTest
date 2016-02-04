package com.kpi.sorting;

/**
 * Created by SG0213064 on 2/2/2016.
 */
public class MySelectionSort {

    public static int[] doSelectionSort(int[] arr) {
        printArray(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("index=" + index + "   " + "j=" + j);
                System.out.println("arr[" + index + "]= " + arr[index] + "    " + "arr[" + j + "] = " + arr[j]);
                if (arr[j] < arr[index]) {
                    index = j;
                    System.out.println("IF ENtered----- index=" + index);
                }
            }

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            printArray(arr);
        }
        return arr;
    }

    public static void printArray(int[] arrToPrint) {
        System.out.println("-----array printed----------");
        for (int arrayItem : arrToPrint) {
            System.out.print(arrayItem + "  ");
        }
        System.out.println("\n-----array printed----------");
    }

    public static void main(String a[]) {

        //int[] arr1 = {6, 4, 3, 2};
        int[] arr1 = {6, 4, 2, 3};
        int[] arr2 = doSelectionSort(arr1);

    }
}
