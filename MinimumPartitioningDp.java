public class MinimumPartitioningDp {
    public static int mPTab(int arr[]){
        int n = arr.length , sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int W = sum/2;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = Math.max(arr[i - 1] + dp[i - 1][j - arr[i - 1]], dp[i - 1][j]);
                } else {
                   dp[i][j] = dp[i - 1][j]; 
                }
            }
        }
        int sum1 = dp[n][W];
        int sum2 = sum - dp[n][W];
        int diff = Math.abs(sum1 -sum2);
        System.out.println("> " + sum);
        return diff;
    }
    public static void main(String args[]){
        int arr[] = {1, 6, 11, 5};
        System.out.println(mPTab(arr));
    }
}