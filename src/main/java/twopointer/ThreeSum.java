package twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        // Sort the array first so that we can discard parts of the problem.
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        // Try using each number as a fixed value, then running a two-sum algorithm on the remainder of the array.
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int currentSum = nums[start] + nums[end] + nums[i];
                if (currentSum == 0) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                } else if (currentSum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return result;
    }
}
