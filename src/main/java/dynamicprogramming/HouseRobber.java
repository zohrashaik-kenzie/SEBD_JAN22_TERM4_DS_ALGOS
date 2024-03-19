package dynamicprogramming;

public class HouseRobber {

    private static int maxMoneyRecursive(int[] HouseNetWorth, int currentIndex) {
        if (currentIndex >= HouseNetWorth.length) {
            return 0;
        }

        int stealCurrentHouse = HouseNetWorth[currentIndex] + maxMoneyRecursive(HouseNetWorth, currentIndex+2);
        int skipCurrentHouse = maxMoneyRecursive(HouseNetWorth, currentIndex+1);

        return Math.max(stealCurrentHouse,skipCurrentHouse );
    }

    public static int maxMoney(int[] HouseNetWorth) {

        return maxMoneyRecursive(HouseNetWorth, 0);
    }

    public static void main (String[] args){
        int[] millionsInHomes = {6, 7, 1, 30, 8, 2, 4};
        System.out.println("Max money stolen = " + maxMoney(millionsInHomes));
    }

    public static class NumberFactor {
        public static int waysToGetN(int n) {
            if ((n==0) || (n==1) || (n==2)) {
                return 1;
            }
            if (n == 3) {
                return 2; //{1,1,1} {3}
            }
            int sub1 = waysToGetN(n-1);
            int sub2 = waysToGetN(n-3);
            int sub3 = waysToGetN(n-4);

            return sub1+sub2+sub3;

        }

        public static void main(String[] args){
            System.out.println("Ways to get 6 = " + waysToGetN(6));
        }
    }
}
