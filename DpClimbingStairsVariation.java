import java.util.Arrays;

public class DpClimbingStairsVariation {
    public static int findWaysMemoi(int n, int m[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (m[n] != -1) {
            return m[n];
        }
        return m[n] = findWaysMemoi(n - 1, m) + findWaysMemoi(n - 2, m) + findWaysMemoi(n - 3, m);
    
    }

    public static int findWaysTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if(i == 1) {
                dp[i] = dp[i - 1] + 0;
            } else if(i == 2) {
                dp[i] = dp[i - 1] + dp[i - 2] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        int m [] = new int[n + 1];
        Arrays.fill(m, -1);
        System.out.println(" > " + findWaysMemoi(n, m));
        // tabulation
        System.out.println(" > " + findWaysTab(n));
    }
}
