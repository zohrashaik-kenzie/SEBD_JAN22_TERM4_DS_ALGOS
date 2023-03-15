package twopointer;

public class Palindrome {
    static boolean isPalindrome(String str)
    {

        int str_length = str.length();
        if (str_length == 0 || str_length == 1){
            return true;
        }

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String args[])
    {
        String str = "level";

        if (isPalindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

