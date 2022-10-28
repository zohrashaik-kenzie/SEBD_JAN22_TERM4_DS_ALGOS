package arrays;

import java.util.Arrays;

public class PairSum {

    public static int[][] calculatePairs(int[] nums, int target) {
        int[][] returnArray = new int[nums.length][];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                   returnArray[count] = new int[]{i,j};
                   count++;
                }
            }
        }
        return returnArray;
    }

    public static void main (String[]args){
        int[] intArray = {2,7,13,15,5};
        int[][] result = calculatePairs(intArray, 20);
        for(int i=0;i<result.length;i++) {
              System.out.println(Arrays.toString(result[i]));
        }

    }

    //time complexiy O(n*n)
}
