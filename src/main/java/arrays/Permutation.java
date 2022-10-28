package arrays;

public class Permutation {

    public static boolean isPermutation(int[] array1, int[] array2){

        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 1;
        int mul2 = 1;

        for (int i = 0; i<array1.length; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
            mul1 *= array1[i];
            mul2 *= array2[i];
        }
        if (sum1 == sum2 && mul1 == mul2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {4,3,2,5,1};
        boolean result = isPermutation(array1, array2);
        System.out.println(result);
    }
}


