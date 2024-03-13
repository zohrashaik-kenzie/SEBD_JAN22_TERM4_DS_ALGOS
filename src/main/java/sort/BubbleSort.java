package sort;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] a = {5,1,4,2,8};
        bubbleSort(a);
        System.out.print("Bubble sort (iteration): " + Arrays.toString(a));
    }
}