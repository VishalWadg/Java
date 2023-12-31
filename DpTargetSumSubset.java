public class DpTargetSumSubset {
    public static boolean targetSum(int sum, int nums[]) {
        int n = nums.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];
        // i -> nums  j -> sum
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                int v = nums[i - 1];
                if (v <= j && dp[i - 1][j - v] == true) { // include
                    dp[i][j] = true;
                }
                else if(dp[i - 1][j] == true) {  // exclude
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int nums[] = {4, 2, 7, 1, 3};
        System.out.println(targetSum(10, nums));
    }
}
