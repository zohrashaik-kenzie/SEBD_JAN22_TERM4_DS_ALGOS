package arrays;

import java.util.Arrays;

public class PairSumWithSortTwoPointer {
    public static int[][] calculatePairs(int[] nums, int target) {
        int[][] returnArray = new int[nums.length][];
        Arrays.sort(nums);
        int i = 0;
        int  j = nums.length -1;
        int count = 0;
        while (i < j)
        {
            if(nums[i] + nums[j] == target) {
                returnArray[count] = new int[]{nums[i] , nums[j] };
                count++;
                i = i+1;
            }
            else if(nums[i] + nums[j] < target)
                i = i+1;
            else
                j = j-1;
        }
        return returnArray;
    }

    public static void main (String[]args) {
        int[] intArray = {2, 7, 13, 15, 5};

        int[][] result = calculatePairs(intArray, 20);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }

    //time complexity O(n)
}
