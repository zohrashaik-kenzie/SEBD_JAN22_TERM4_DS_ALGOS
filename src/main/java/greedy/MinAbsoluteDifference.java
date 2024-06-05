package greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MinAbsoluteDifference {
    public static int minimumAbsoluteDifference(List<Integer> arr) {
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.size()-1;i++){
            min = Math.min(min,Math.abs(arr.get(i)- arr.get(i+1)));
        }
        return min;
    }

    public static void main(String[] args) throws IOException {

        Integer[] arr = {4,-1,5};
        //-1,4,5
        List<Integer> list = Arrays.asList(arr);

        int result = minimumAbsoluteDifference(list);
        System.out.println("Result = " + result);

    }
}

