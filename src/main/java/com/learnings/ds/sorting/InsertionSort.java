package com.learnings.ds.sorting;

/**
 * Insertion Sort
 * In insertion sort, every iteration moves an element from unsorted portion to sorted portion until all the elements are sorted in the list.
 * An analogy of insertion sort is the sorting of a deck of cards with our hands.
 * We select one card from the unsorted deck and put it in the right order in our hands, effectively sorting the whole deck.
 */
public class InsertionSort implements Sorting{

    public static void main(String[] args) {
        int arr[] = {1,4,2,5,6,7,10,23,11};
        InsertionSort is = new InsertionSort();
        is.sort(arr);
        for(int x : arr)
            System.out.println(x);
    }

    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int currentVal = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > currentVal){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentVal;
        }

    }
}
