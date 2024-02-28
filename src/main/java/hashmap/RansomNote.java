package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RansomNote {
    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        if(magazine.containsAll(note)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static void checkMagazine2(List<String> magazine, List<String> note) {
        // Write your code here

        HashMap<String, Integer> magazineHash = generateFrequencyMap(magazine);
        HashMap<String, Integer> noteHash = generateFrequencyMap(note);

        for (Map.Entry<String, Integer> mapElement : noteHash.entrySet()) {
            String key = mapElement.getKey();
            if (!magazineHash.containsKey(key)){
                System.out.println("No");
                return;
            }
            else {
                int value = mapElement.getValue();
                int magazine_value = magazineHash.get(key);
                if (value > magazine_value){
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");

    }

    private static HashMap<String,Integer> generateFrequencyMap(List<String> list){
        HashMap<String,Integer> hash = new HashMap<>();

        for(String word: list){
            if (hash.containsKey(word)){
                int frequency = hash.get(word);
                hash.put(word, ++frequency);
            } else {
                hash.put(word,1);
            }
        }

        return hash;
    }

    public static void main(String[] args){
        String[] magazines= {"this", "is", "a", "ransom", "note", "for",
                "one", "grand"};
        String[] notes = {"this", "is", "a", "note", "is"};
        List<String> magList = Arrays.asList(magazines);
        List<String> noteList = Arrays.asList(notes);

        checkMagazine2(magList, noteList);
    }
}
