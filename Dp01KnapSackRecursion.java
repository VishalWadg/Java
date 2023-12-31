public class Dp01KnapSackRecursion {
    public static int knapSack(int wt[], int val[], int W, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) {// valid
            // include
            int ans1 = val[n - 1] + knapSack(wt, val, W - wt[n - 1] , n - 1);
            // exclude
            int ans2 = knapSack(wt, val, W, n - 1);
            return Math.max(ans1, ans2);
        } else {            // invalid
            return knapSack(wt, val, W, n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int Wt[] = {2, 5, 1, 3, 4};
        int val[] = {15, 14, 10, 45, 30};
        int W = 7;
        System.out.println("Max Profit > " + knapSack(Wt, val, W, n));
    }
}
