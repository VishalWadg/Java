import java.util.Arrays;

public class DpClimbingStairs {
    public static int findWaysMemoi(int n, int w[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (w[n] != -1) {
            return w[n];
        }
        return w[n] = findWaysMemoi(n - 1, w) + findWaysMemoi(n - 2, w);
    }
    public static int findWaysTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if(i == 1){
                dp[i] = dp[i - 1] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        int w[] = new int[n + 1];
        Arrays.fill(w, -1);
        // Memoization
        System.out.println("Memoization > " + findWaysMemoi(n, w));
        // tabulation
        System.out.println("Tabulation > " + findWaysTab(n));
    }
}
