package com.kpi.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by T5500 on 2016-01-31.
 */
public class MyBubbleSort {

    // logic to sort the elements
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            System.out.println("main loop iter=" + m);
            boolean isSwapped = false;
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                System.out.println("SWAP=False - Exit Loop");
                break;
            }
            printNumbers(array);


        }
    }

    private static void swapNumbers(int i, int j, int array[]) {

        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printNumbers(int[] input) {
        Arrays.stream(input).mapToObj(value -> value + " --- ").forEach(System.out::print);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        //int[] input = { 6, 4, 2, 1 };
        int[] input2 = { 6,4,2,1 };
        System.out.println("Before sort=");
        printNumbers(input2);
        System.out.println("Sorting has started...");
        bubble_srt(input2);

    }
}
