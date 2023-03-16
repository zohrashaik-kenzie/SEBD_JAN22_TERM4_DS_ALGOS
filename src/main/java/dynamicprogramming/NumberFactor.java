package dynamicprogramming;


public class NumberFactor {
    private static int waysToGetNTopDown (int[] dp, int n) {
        if (n==0||n==1||n==2) {
            return 1;
        }
        if (n==3) {
            return 2;
        }
        if (dp[n]==0) {
            int sp1 = waysToGetNTopDown(dp, n-1);
            int sp2 = waysToGetNTopDown(dp, n-3);
            int sp3 = waysToGetNTopDown(dp, n-4);
            dp[n] = sp1 + sp2 + sp3;
        }
        return dp[n];
    }

    public int waysToGetNTopDown(int n) {
        int dp[] = new int[n+1];
        return waysToGetNTopDown(dp, n);
    }

    public static void main(String[] args) {
        NumberFactor np = new NumberFactor();
        System.out.println(np.waysToGetNTopDown(100));
    }
}
