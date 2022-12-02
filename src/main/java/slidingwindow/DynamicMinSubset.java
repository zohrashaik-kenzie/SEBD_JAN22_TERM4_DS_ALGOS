package slidingwindow;

public class DynamicMinSubset {
    // Function to find the length of the smallest subarray whose sum
    // of elements is greater than the given number
    public static int findSmallestSubarrayLen(int[] arr, int target_sum)
    {
        int windowStart = 0;
        int currentWindowSum = 0;
        int minWindowSize = Integer.MAX_VALUE;
        for(int windowEnd = 0; windowEnd< arr.length; windowEnd++) {
            currentWindowSum += arr[windowEnd];
            while (currentWindowSum >= target_sum) {
                minWindowSize = Math.min(minWindowSize, windowEnd - windowStart + 1);
                currentWindowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return minWindowSize;
    }

    public static void main(String[] args)
    {
        // an array of positive numbers
        int[] A = {4,2,2,7,8,1,2,8,1,0};
        int k = 10;

        // find the length of the smallest subarray
        int len = findSmallestSubarrayLen(A, k);

        if (len != Integer.MAX_VALUE) {
            System.out.print("The smallest subarray length is " + len);
        }
        else {
            System.out.print("No subarray exists");
        }
    }
}

