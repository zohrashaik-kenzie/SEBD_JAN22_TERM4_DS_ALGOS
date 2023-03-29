package twopointer;

public class StringReversal {

    public static String reverse(String text) {

        // Convert into array
        char[] chars = text.toCharArray();

        // Initialize pointers
        int left;
        int right = text.length() - 1;

        // Loop through swapping left and right until we hit the middle
        for (left = 0; left < right; left++, right--) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args){
        System.out.println(reverse("SEBD Advanced Java Course"));
    }
}
