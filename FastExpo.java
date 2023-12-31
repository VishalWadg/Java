public class FastExpo {
    public static int expo(int n, int p) {
        int ans = 1;
        while (p > 0) {
            if ((p & 1) != 0) {
                ans = ans * n;
            }
            n = n * n;
            p = p >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int p = 3;
        System.out.println("Power : " + expo(n, p));
    }
}
