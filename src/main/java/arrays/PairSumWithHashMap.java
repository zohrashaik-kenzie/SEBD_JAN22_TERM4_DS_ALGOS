package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairSumWithHashMap {

    public static int[][] calculatePairs(int[] nums, int target) {
        int[][] returnArray = new int[nums.length][];
        int count = 0;
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                returnArray[count] = new int[]{complement , nums[i] };
                count++;
            } else {
                numMap.put(nums[i], i);
            }
        }
        return returnArray;
        }


    public static void main(String[] args) {
        int[] intArray = {2, 7, 13, 15, 5};
        int[][] result = calculatePairs(intArray, 20);
        for (int i = 0; i < intArray.length; i++) {
            if(result[i] != null)
                System.out.println(Arrays.toString(result[i]));
        }
    }
}
