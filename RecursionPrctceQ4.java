public class RecursionPrctceQ4 {
    public static int sbstrng(String str, int strt, int ed, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        System.out.println(str.substring(strt,ed + 1));
        int count = sbstrng(str, strt + 1, ed, n - 1) + sbstrng(str, strt, ed - 1, n-1) - sbstrng(str, strt + 1, ed - 1, n - 2);
        if (str.charAt(strt) == str.charAt(ed)) {
            count++;
            
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(sbstrng(str, 0, str.length() - 1,n));
    }
}
