package recursion;

import java.util.ArrayList;
import java.util.List;

public class FibDemo {

    static int fibonacciRec(int n)
    {
        // Base Case
        if (n < 2){
            return n;
        }

        // Recursively computing the term
        // using recurrence relation
        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    } //exponential O(2^n) O(1) space



    // Function to print N Fibonacci Number
    public static void fibonacciIterative(int n) {
        int num1 = 0, num2 = 1;
        int num3 = 0;
        int counter = 0;

        // Iterate till counter is N
        while (counter < n) {
            System.out.print(num1 + " ");
            // Swap
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        //O(n); O(1)
    }

    //formula an = [Phin – (phi)n] / Sqrt[5]. where Phi =  (1 + Sqrt[5]) /phi = (1 – Sqrt[5]) / 2 i

    static int getElementN(int n){
        double Phi = (1+ Math.sqrt(n))/2;
        double phi = (1 - Math.sqrt(n))/2;
        double term = (Math.pow(Phi,n) - Math.pow(phi,n))/Math.sqrt(n);

        return new Double(term).intValue();
    }
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
        int n = 10;
        System.out.println("Element =" + getElementN(n));
        // Print the first N numbers
        System.out.println("Recursion:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRec(i) + " ");
        }
        System.out.println();
        System.out.println("Iteration:");
        fibonacciIterative(n);
//
        System.out.println();
        System.out.println("ArrayList:");
        List<Integer> fibList = fibonacciDynamic(n);
        fibList.forEach(number->System.out.print(number + " "));

    }

}
