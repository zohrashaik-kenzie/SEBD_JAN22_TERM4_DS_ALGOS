package slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxDistinctSubArray {
    public static List<Integer> addSubArray(int[] A, int i, int j)
    {
        List<Integer> returnList = new ArrayList<>();
        for (int index = i; index <= j; index++) {
            returnList.add(A[index]);
        }

        return returnList;
    }


    // Function to print all subarrays having distinct elements
    public static List<List<Integer>> calculate(int[] A)
    {
        List<List<Integer>> returnList = new ArrayList<>();
        int n = A.length;

        // create a map to mark elements as visited in the current window
        Map<Integer, Boolean> visited = new HashMap<>();

        // put all elements on a map
        for (int val: A) {
            visited.put(val, false);
        }

        // points to the left and right boundary of the current window,
        // i.e., the current window is formed by `A[left, right]`
        int right = 0, left = 0;

        // loop until the right index of the current window is less
        // than the maximum index
        while (right < n)
        {
            // keep increasing the window size if all elements in the
            // current window are distinct
            while (right < n && !visited.get(A[right]))
            {
                visited.put(A[right], true);
                right++;
            }
            returnList.add(addSubArray(A, left, right - 1));

            // As soon as a duplicate is found (`A[right]`),
            // terminate the above loop, and reduce the window's size
            // from its left to remove the duplicate

            while (right < n && visited.get(A[right]))
            {
                visited.put(A[left], false);
                left++;
            }
        }
        return returnList;
    }
    public static void main(String[] args)
    {
        int[] A = { 5, 2, 3, 5, 4, 3 };

        List<List<Integer>> list = calculate(A);
        for(int i=0;i<list.size();i++){
            List<Integer> listi = list.get(i);
            System.out.print("{ ");
            for(int j=0;j<listi.size();j++){
                System.out.print(listi.get(j) + " ");
            }
            System.out.println("}");

        }
    }
}

