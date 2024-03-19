package dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class FibDPDemo {

    //O(1) O(1)
    static List<Integer> fibonacciDynamic(int n)
    {

        // Declare an array to store
        // Fibonacci numbers.
        // 1 extra to handle case, n = 0
        List<Integer> fibList = new ArrayList();
        // 0th and 1st number of
        // the series are 0 and 1
        fibList.add(0); // O(1)
        fibList.add(1); // O(1)

        for (int i = 2; i < n; i++) { // O(n)

            // Add the previous 2 numbers
            // in the series and store it
            fibList.add(fibList.get(i-1) + fibList.get(i-2)); //O(1)
        }

        // Nth Fibonacci Number
        return fibList;
        //O(n); O(n)
    }


    // Driver Code
    public static void main(String[] args)
    {
        List<Integer> fibList = fibonacciDynamic(10);
        fibList.forEach(number->System.out.print(number + " "));

    }

}
