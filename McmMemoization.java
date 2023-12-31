public class McmMemoization {

    public static int mcmMemoi(int arr[], int i, int j, int dp[][]){
        if (i == j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = mcmMemoi(arr, i, k, dp);
            int cost2 = mcmMemoi(arr, k+1, j, dp);
            int cost3 = arr[i - 1]*arr[k]*arr[j];
            int finalcost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalcost);
        }
        return dp[i][j] = ans;
    }

    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 3};
        int dp[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.print(mcmMemoi(arr, 1, 4, dp));
    }
}
