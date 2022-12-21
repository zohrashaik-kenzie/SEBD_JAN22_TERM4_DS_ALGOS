package slidingwindow;

public class MaxContiguousOnes {
    // Find the index of 0 to replace with 1 to get the maximum sequence
    // of continuous 1's using the sliding window technique
    public static int findIndexofZero(int[] A)
    {
        int left = 0; //starting index for our sliding window
        int zero_count = 0; //total number of zeros in our current window
        int max_one_count = 0; //stores the maximum number of 1's
        int zero_index = 0;
        int prev_zero_index = 0;
        for(int i=0;i<A.length;i++) {
            if (A[i] == 0) {
                zero_count++;
                prev_zero_index = i;
            }

            if (zero_count > 1) {
                while (A[left] != 0) {
                    left++;
                }
                left++;
                zero_count = 1;
            }
            int window_len = i - left + 1;
                //max_one_count = Math.max(max_one_count, window_len);
            if (window_len > max_one_count) {
                max_one_count = window_len;
                zero_index = prev_zero_index;
            }
        }
        return zero_index;
    }

    public static void main (String[] args)
    {
        int[] A = { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };

        int index = findIndexofZero(A);

        if (index != -1) {
            System.out.print("Index to be replaced is " + index);
        }
        else {
            System.out.print("Invalid input");
        }
    }
}
