package greedy;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Contains a problem that can be solved using the Greedy Technique.
 */
public class BackPacking {

    /**
     * Given a list of snacks with their weight, and a given weight limit, return the maximum number
     * of snacks that you could pack without exceeding the weight limit. Assume you only have one of each snack.
     *
     * Example: [(snackName, weight)]
     * snacks = [(peanuts, 8), (chips, 3), (protein bar, 9), (berries, 7), (banana, 4), (cookies, 10)]
     * weightLimit = 20
     *
     * result = [(chips, 3), (banana, 4), (berries, 7)] -> 3 snacks
     *
     * @param backPackItems      - the list of snacks from which to identify the maximum snacks to pack
     * @param weightLimit - the maximum weight of snacks we can pack
     * @return the maximum number of snacks we can pack
     */
    public static List<BackPackItem> getMaximumSnacks(List<BackPackItem> backPackItems, int weightLimit) {
        List<BackPackItem> results = new ArrayList<>();

       backPackItems.sort(Comparator.comparing(BackPackItem::getWeight));
        //backPackItems.sort((s1,s2) -> Math.min(s1.getWeight(),s2.getWeight()));
        int remainingWeight = weightLimit;

        for (BackPackItem backPackItem : backPackItems) {
            if (backPackItem.getWeight() <= remainingWeight) {
                results.add(backPackItem);
                remainingWeight -= backPackItem.getWeight();
            } else {
                break;
            }
        }

        return results;
    }

    public static void main(String[] args){
        List<BackPackItem> backPackItems = new ArrayList<>();

        backPackItems.add(new BackPackItem("Green Item", 5));
        backPackItems.add(new BackPackItem("Grey Item",2));
        backPackItems.add(new BackPackItem("Grey Item",4));
        backPackItems.add(new BackPackItem("Orange Item",1));
        backPackItems.add(new BackPackItem("Blue Item",2));
        backPackItems.add(new BackPackItem("Green Item", 5));
        backPackItems.add(new BackPackItem("Green Item", 5));

       List<BackPackItem> result = getMaximumSnacks(backPackItems,20);
       for(BackPackItem item: result){
           System.out.println(item);
       }
    }
}
