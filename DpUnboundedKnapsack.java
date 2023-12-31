public class DpUnboundedKnapsack {
    public static int unboundedKnapsack(int wt[], int val[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];
                if (w <= j) { // valid 
                    int excProf = dp[i - 1][j];
                    int incProf = v + dp[i][j - w];
                    dp[i][j] = Math.max(incProf, excProf);
                } else {    // invalid
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int Wt[] = {2, 5, 1, 3, 4};
        int val[] = {15, 14, 10, 45, 30};
        int W = 7;
        System.out.println(unboundedKnapsack(Wt, val, W));
    }
}
