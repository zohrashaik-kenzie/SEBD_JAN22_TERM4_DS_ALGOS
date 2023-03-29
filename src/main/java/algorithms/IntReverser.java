package algorithms;

public class IntReverser {

    public static int reverse(int x) {
        boolean isNegative = x < 0;

        if(isNegative) {
            x = x * -1;
        }

        int reverse = 0;
        int lastDigit = 0;

        while (x >= 1) {
            lastDigit = x % 10; // gives you last digit
            reverse = reverse * 10 + lastDigit;
            x = x / 10; // get rid of last digit
        }

        return isNegative ? reverse*-1 : reverse;

    }

    public static void main(String[] args){
        System.out.println(reverse(91235));
    }
}
