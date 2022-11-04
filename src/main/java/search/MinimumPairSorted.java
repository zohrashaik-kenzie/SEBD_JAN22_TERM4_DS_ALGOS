package search;

import java.util.Arrays;

public class MinimumPairSorted {
    public static void findPair(int[] A)
    {
        if (A.length < 2) {
            return;
        }

        // sort the array if it is unsorted
         Arrays.sort(A);

        // maintain two indexes pointing to endpoints of the array
        int low = 0;
        int high = A.length - 1;

        // `min` stores the minimum absolute difference
        int min = Integer.MAX_VALUE;
        int i = 0, j = 0;

        // reduce the search space `A[low…high]` at each iteration of the loop

        // loop if `low` is less than `high`
        while (low < high)
        {
            // update the minimum if the current absolute sum is less
            if (Math.abs(A[high] + A[low]) < min)
            {
                min = Math.abs(A[high] + A[low]);
                i = low;
                j = high;
            }

            // optimization: pair with zero-sum is found
            if (min == 0) {
                break;
            }

            // increment `low` index if the total is less than 0;
            // decrement `high` index if the total is more than 0
            if (A[high] + A[low] < 0) {
                low++;
            }
            else {
                high--;
            }
        }

        // print the pair
        System.out.print("Pair found (" + A[i] + ", " + A[j] + ")");
    }

    public static void main(String[] args) {
        int arr[] = {1, 60, -10, 70, -80, 85};
        // -80,-10,1,60,70,85

        findPair(arr);
    }
}
