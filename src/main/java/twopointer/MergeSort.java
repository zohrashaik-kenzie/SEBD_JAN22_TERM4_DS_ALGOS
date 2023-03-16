package twopointer;

import java.util.Arrays;

public class MergeSort {
    public int[] merge(int[] A, int[] B) {
        // initialize m and n to length of arrays A and B
        int m = A.length;
        int n = B.length;

        // create result array C of length (m+n)
        int[] C = new int[m+n] ;

        // initialize i, j and k to 0
        // Index i is for array A
        // Index j is for array B
        // Index k is for result array C
        int i=0 , j = 0, k = 0;

        //Condition to check any array got exhausted ?
        while(i < m && j < n){
            // compare A[i] with B[j]
            if(A[i] < B[j]){
                // As A[i] is smaller, copy A[i] into C[k]
                C[k] = A[i];
                // as A[i] processed move to next element by incrementing i
                // as C[k] already filled, move to next index by incrementing k
                i++; k++;
            }else{
                // As B[j] is smaller, copy B[j] into C[k]
                C[k] = B[j];
                // as B[j] processed move to next element by incrementing j
                // as C[k] already filled, move to next index by incrementing k
                j++; k++;
            }
        }
        // This is the case when array B all elements processed and A has still unvisited elements
        while(i < m) {
            C[k++] = A[i++];
        }
        // This is the case when array A all elements processed and B has still unvisited elements
        while (j < n) {
            C[k++] = B[j++];
        }
        // return the result array
        return C;
    }

    // Driver Code to test the code
    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        int[] A = {1, 3, 5, 6};
        int[] B = {2, 4, 7};
        int[] resultArray = obj.merge(A, B);
        System.out.println(Arrays.toString(resultArray));
    }
}

