package slidingwindow;

/**
 * Contains a problem that can be solved using the Expanding Window Technique.
 */
public class KRepeatingElements {

    /**
     * Given a string s and an integer k, return the length of the longest substring of s such that the
     * frequency of each character in this substring is greater than or equal to k.
     *
     * Example:
     *   s = aaabb
     *   k = 3
     *
     *   result = aaa
     *
     * @param s - the string from which to identify the longest substring where each character appears
     *          at least k times. s will contain only lowercase letters.
     * @param k - the minimum frequency which each character should appear in the substring. k will be
     *          a positive number.
     * @return the length of the longest substring of s where each character appears at least k times.
     */
    public static int kRepeatingElements(String s, int k) {
        int result = 0;
        // Since we can't definitively say when to shrink the window solely based on the current number
        // of characters with at least k repeats, we have to break down into sub-problems to ensure we
        // cover each case.
        for (int uniqueTarget = 1; uniqueTarget <= 26; uniqueTarget++) {

            // We can convert each Char into an int to index into this array.  char - 'a' will convert the char to an
            // ASCII int and then subtract the ASCII value of 'a'.  This gives you a zero-indexed integer representing
            // the characters a - z as 0 - 25s.
            // This is slightly more efficient than using a Map<Char, Integer> because there is a fixed number of
            // entries that we know in advance.  This prevents the compiler from have to re-allocate the map multiple times.
            int[] frequencyCount = new int[26];
            int uniqueChars = 0;
            int charsWithKRepeats = 0;
            int start = 0;
            int end = 0;
            int longest = 0;

            while (end < s.length()) {
                int expandedWindowChar = s.charAt(end) - 'a';
                // If there are currently 0 occurrences of this character, it's unique.
                if (frequencyCount[expandedWindowChar] == 0) {
                    uniqueChars++;
                }
                frequencyCount[expandedWindowChar]++;
                // If after incrementing, we have k occurrences of this character, increment.
                if (frequencyCount[expandedWindowChar] == k) {
                    charsWithKRepeats++;
                }
                end++;

                while (uniqueChars > uniqueTarget) {
                    // Adjust state variables as we shrink the window
                    int startingWindowChar = s.charAt(start) - 'a';
                    if (frequencyCount[startingWindowChar] == k) {
                        charsWithKRepeats--;
                    }
                    frequencyCount[startingWindowChar]--;
                    if (frequencyCount[startingWindowChar] == 0) {
                        uniqueChars--;
                    }
                    start++;
                }

                if (uniqueChars == charsWithKRepeats) {
                    longest = Math.max(end - start, longest);
                }
            }
            result = Math.max(longest, result);
        }
        return result;
    }
}
