public class GreedyAlgoPracticeQ5 {
    public static int ans = 10000000;
    public static void subarraySmallestMaxSum(int arr[], int n, int k, int idx, int sum, int maxSum) {
        if (k == 1) {
            maxSum = Math.max(maxSum, sum);
            sum = 0;
            for (int i = idx; i < n; i++) {
                sum += arr[i];
            }
            // System.out.println("sum k = 1 > " + sum);
            maxSum = Math.max(maxSum, sum);
            // System.out.println("maxSum k = 1 > " + maxSum);
            ans = Math.min(ans, maxSum);
            // System.out.println("Ans k = 1 > " + ans);
            return;
        } 
        sum = 0;
        for (int i = idx; i < n; i++) {
            sum += arr[i];
            // System.out.print("sum > " + sum + " ");
            maxSum = Math.max(maxSum, sum);
            // System.out.println("maxSum > " + maxSum + " ");
            subarraySmallestMaxSum(arr, n, k - 1, i + 1, sum, maxSum);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2};
        int n = arr.length;
        int k = 5;
        subarraySmallestMaxSum(arr, n, k, 0, 0, 0);
        System.out.println(" > " + ans);
    }
}
