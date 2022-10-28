package arrays;

public class MissingNumber2 {
    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};

        int sum_n = (arr.length +1) * (arr.length + 2) / 2;
        int sum_array = 0;
        for (int i = 0; i < arr.length; i++) {
            sum_array += arr[i];
        }

        int diff = sum_n - sum_array;
        if(diff > 0)
            System.out.println("The missing number is: " + diff);
        else
            System.out.println("There is no missing number");
    }

}
