public class Dp01KnapSack {
    public static int knapSackMemoi(int wt[], int val[], int W, int n, int dp[][]) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        if (wt[n - 1] <= W) {// valid
            // include
            int ans1 = val[n - 1] + knapSackMemoi(wt, val, W - wt[n - 1] , n - 1, dp);
            // exclude
            int ans2 = knapSackMemoi(wt, val, W, n - 1, dp);
            return dp[n][W] = Math.max(ans1, ans2);
        } else {            // invalid
            return dp[n][W] = knapSackMemoi(wt, val, W, n - 1, dp);
        }
    }

    public static int knapSackTab(int wt[], int val[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }else if(wt[i - 1] <= j) { // valid   include or exclude
                    int v = val[i - 1];                   // value of ith item
                    int w = wt[i - 1];                    // weight of ith item
                    int incProf = dp[i - 1][j - w] + v;   // profit when ith item included i.e. value of ith item added and weight subtracted
                    int excProf = dp[i - 1][j];           // profit when ith item excluded 
                    dp[i][j] = Math.max(incProf , excProf);   // max of included profit & excluded profit
                } else {                  // invalid  exclude
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        int n = 5;
        int Wt[] = {2, 5, 1, 3, 4};
        int val[] = {15, 14, 10, 45, 30};
        int W = 7;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println("Max Profit Memoized > " + knapSackMemoi(Wt, val, W, n, dp));
        System.out.println("Max Profit Tabulized > " + knapSackTab(Wt, val, W));
    }
}
