public class DynamicProgrammingFiboSeries {
    public static int fibonancciMemoi(int n, int fib[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (fib[n] != 0) {
            return fib[n];
        }
        return fib[n] = fibonancciMemoi(n - 1, fib) + fibonancciMemoi(n - 2, fib);  // memoization
    }
    public static int fibonancciTab(int n) {
        int dp [] = new int [n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static void main(String args[]) {
        int n = 6;
        System.out.println(" > " + fibonancciMemoi(n, new int[n + 1]));
        // tabulation
        System.out.println(" > " + fibonancciTab(n));
    }
}
