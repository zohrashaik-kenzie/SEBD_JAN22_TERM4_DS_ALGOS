package sort;

import java.util.Arrays;

public class QuickSort {

    public static int[] sort(int[] array) {
        // Pick a pivot element randomly

        // Walk through the array making sure that all the elements
        // are smaller before the pivot, and that all elements after are bigger
        // and we do this in place! That's the killer feature. No extra array required.
        //
        // Then we repeat the process to the left and right portions over and over again
        // Then eventually our array becomes sorted.

        quickSort(array, 0, array.length - 1);

        return array;
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        // Step 1: Pick a pivot element - we will choose the center
        // Better would be to choose left + (right-left)/2 (as this would avoid overflow error for large arrays i.e. 2GB))
        int pivot = array[(left + (right-left))/2];

        // Step 2: Partition the array around this pivot - return the index of the partition
        int index = partition(array, left, right, pivot);

        // Step 3: Sort on the left and the right side
        quickSort(array, left, index - 1);
        quickSort(array, index, right);
    }

    private static int partition(int[] array, int left, int right, int pivot) {
        // Move the left and right pointers in towards each other
        while (left <= right) {

            // Move left until you find an element bigger than the pivot
            while(array[left] < pivot) {
                left++;
            }

            // Move right until you find an element smaller than the pivot
            while (array[right] > pivot) {
                right--;
            }

            // Then swap
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }

        // When we get here, everything in this partition will be in the right order
        // Now we need to return next partition point - which for us will be left
        return left;
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }


    public static void main(String[] args) {
        int[] a = {9,-3,5,2,6,8,-6,1,3};
        sort(a);
        System.out.print("Quick sort (iteration): "  +  Arrays.toString(a));
    }
}