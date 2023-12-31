public class DpPart6AssQ3 {
    public static void maxProfit(int arr[], int ans[], int n, int fee){
        int i, j, profit;
        int l, r, diff_day = 1, sum = 0;
        ans[0] = 0;
        ans[1] = diff_day;
        for (i = 1; i < n; i++) {
            l = 0;
            r = diff_day;
            sum = 0;
            for (j = n - 1; j >= i; j--) {
                profit = (arr[r] - arr[l]) - fee;
                if (profit > 0) {
                    sum = sum + profit;
                }
                l++;
                r++;
            }
            if (ans[0] < sum) {
                ans[0] = sum;
                ans[1] = diff_day;
            }
            diff_day++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 1, 7, 2, 8, 4};
        int n = arr.length;
        int ans[] = new int[2];
        int tranFee = 2;
        maxProfit(arr, ans, n, tranFee);
        System.out.println("> " + ans[0] + " " + ans[1]);
    }
}
