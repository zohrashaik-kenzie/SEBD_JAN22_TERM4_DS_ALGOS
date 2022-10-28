package arrays;

public class MissingNumber {

    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,6,7,8,9,10,12};
        int index = 0;
        for(int i= 0;i<arr.length;i++){
            if (arr[i] != i+1){
                index = i+1;
                break;
            }
        }
        if (index > 0) {
            System.out.println("The missing number is:" + index);
        }
        else {
            System.out.println("There is no missing number");
        }
    }
}

