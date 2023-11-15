package com.learnings.ds.sorting;

/**
 * Bubble Sort
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
 * The pass through the list is repeated until the list is sorted.
 */

public class BubbleSort implements Sorting{
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,6,7,10,23,11};
        BubbleSort bs = new BubbleSort();
        bs.sort(arr);
        for(int x : arr)
            System.out.println(x);

    }

    @Override
    public void sort(int []arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j<arr.length;  j++){
                int temp = arr[i];
                if(temp > arr[j]){
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
