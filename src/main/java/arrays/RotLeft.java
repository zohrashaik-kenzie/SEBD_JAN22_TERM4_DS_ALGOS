package arrays;

public class RotLeft {

    public static int[] arrayLeftRotation(int[] a, int k) {

        //n is the size of the array, k is the number of rotations
        int n = a.length;
        int[] returnArray = new int[n];
        try
        {
            for(int i=0;i<n-k;i++)
            {
                returnArray[i] = a[k+i];
            }
            for(int i=0;i<k;i++)
            {
                returnArray[n-k+i] = a[i];
            }

        }
        catch(Exception e)
        {

        }

        return returnArray;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        int[] rotArray = arrayLeftRotation(array, 4);
        for(int i=0;i<rotArray.length;i++){
            System.out.print(rotArray[i] + " ");
        }
    }
}
