package slidingwindow;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MaximumWindow {
    public static int findMaximumSum(List<Integer> input, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += input.get(i);
        }

        int maxSum = windowSum;
        for (int right = k; right < input.size(); right++) {
            windowSum -= input.get(right - k);
            windowSum += input.get(right);

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args){
        Integer array[] = new Integer[]{4,2,1,7,8,1,2,8,1,0};
        List<Integer> list = Arrays.asList(array);
        int max = findMaximumSum(list,3);
        System.out.println("Max sum = " + max);

    }

}
