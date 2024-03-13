package arrays;

import java.util.Arrays;

public class PermutationSort {
    public static boolean isPermutation(int[] array1, int[] array2) {

        if(array1.length != array2.length){
            return false;
        }
        Arrays.sort(array1);
        Arrays.sort(array2);

        for(int i=0;i<array1.length;i++){
            if (array1[i] != array2[i])
                return false;
        }
        return true;
    }

        public static void main(String[] args){
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,2,3,1,4};
        boolean result = isPermutation(array1, array2);
        System.out.println(result);
    }
}
