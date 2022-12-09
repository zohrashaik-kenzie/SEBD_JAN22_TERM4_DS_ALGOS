package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class KRepeatingElementsRec {
    public static int longestSubstring(String s, int k){
        Map<Character,Integer> frequencyMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
        }

        boolean valid = true;
        int start = 0;
        int maxLen = 0;
        for(int end=0;end<s.length();end++){
            if(frequencyMap.get(s.charAt(end)) > 0 &&
                    frequencyMap.get(s.charAt(end)) < k){
                String subString = s.substring(start,end);
                maxLen = Math.max(maxLen, longestSubstring(subString,k));
                start = end + 1;
                valid = false;
            }
        }
        if (valid){
            return s.length();
        } else {
            return Math.max(maxLen,longestSubstring(s.substring(start),k));
        }
    }



    public static void main(String[] args){
        String s= "aaabbcddaeaaff";
        int maxlen = longestSubstring(s,2);
        System.out.println("Max Substring with K Repeating elements = " + maxlen);
    }
}
