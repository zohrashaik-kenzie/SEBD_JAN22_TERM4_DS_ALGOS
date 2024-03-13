package arrays;

import java.util.HashMap;

public class PermutationHashMap {

    public static boolean isPermutation(int[] array1, int[] array2){

        HashMap<Integer,Integer> seen = new HashMap();
        for (int i = 0; i<array1.length; i++) {
            if(seen.get(array1[i]) == null){
                seen.put(array1[i],1);
            } else {
                int cnt =  seen.get(array1[i]);
                seen.put(array1[i],cnt+1);
            }
        }
        for (int i = 0; i<array2.length; i++) {
            if (seen.get(array2[i]) == null){
                return false;
            } else {
                int cnt = seen.get(array2[i]);
                if(cnt == 1){
                    seen.remove(array2[i]);
                } else {
                    seen.put(array2[i], --cnt);
                }
            }
        }

        if(seen.isEmpty()) return true;
        return false;
    }
    public static void main(String[] args){
        int[] array1 = {1,2,3,4,5,1};
        int[] array2 = {4,3,2,5,1,1};
        boolean result = isPermutation(array1, array2);
        System.out.println(result);
    }
}
