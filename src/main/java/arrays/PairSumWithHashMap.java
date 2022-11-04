package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class PairSumWithHashMap {

    public static int[][] calculatePairs(int[] nums, int target) {

        int[][] returnArray = new int[nums.length][];
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (map.containsKey(key)) {
                returnArray[count] = new int[]{key, nums[i]};
                count++;
            }
            map.put(key, nums[i]);
        }
        return returnArray;
    }

    public static void main(String[] args) {
        int[] intArray = {2, 7, 13, 15, 5};
        int[][] result = calculatePairs(intArray, 20);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
