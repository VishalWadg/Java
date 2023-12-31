import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
public class DpLis {
    public static int lcs(int arr[], int arr2[]) {
        int n = arr.length, m = arr2.length;
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (arr[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static int lis(int arr[]) {
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            st.add(arr[i]);
        }
        int arr2[] = new int[st.size()];
        int i = 0;
        for (int x : st) {
            arr2[i] = x;
            i++;
        }
        Arrays.sort(arr2);
        return lcs(arr, arr2);
    }
    public static void main(String[] args) {
        int arr[] = {50, 3, 10, 7, 40, 80};
        System.out.println(lis(arr));
    }
}
