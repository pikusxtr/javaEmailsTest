package com.kpi.sorting;

/**
 * Created by SG0213064 on 2/3/2016.
 */
public class MyInsertionSort {

    public static void main(String a[]){
        int[] arr1 = {6, 4, 3, 2};
        MySelectionSort.printArray(arr1);
        int[] arr2 = doInsertionSort(arr1);
        MySelectionSort.printArray(arr2);


    }

    public static int[] doInsertionSort(int[] input){

        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    System.out.println("IF Entered");
                    System.out.println("input[" + j+ "] = "+ input[j]+ "    input[" + (j-1)+ "] = "+ input[j-1] );
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}
