public class DpLongestCommonSubstring {

    public static int lcStringTab(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        int dp[][] = new int [n + 1][m + 1];
        int ans = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str1 = "APPLE";
        String str2 = "PINEAPPLE";
        System.out.println(lcStringTab(str1, str2));
    }
}
