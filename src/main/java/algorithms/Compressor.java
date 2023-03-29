package algorithms;

import java.util.HashMap;
import java.util.Map;

public class Compressor {
    public static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;

            // If next char different, append this result
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 0;
            }
        }
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static String compress2(String str) {
        Map<Character,Integer> map = new HashMap<>();

        StringBuilder compressed = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(Character c: map.keySet()){
            compressed.append(c);
            compressed.append(map.get(c));
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        String str = "xxxaaabbbbbcccccccccd";
        //System.out.println(compress(str));
        System.out.println(compress2(str));
    }
}
