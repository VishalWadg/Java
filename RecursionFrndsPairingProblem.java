public class RecursionFrndsPairingProblem {
    public static int pairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return pairs(n - 1) + (n - 1) * pairs(n - 2);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("> " + pairs(n));
    }
}
