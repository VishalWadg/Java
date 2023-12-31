public class RecursionPowerOfNum_OptimizedApproch {
    public static int power(int x, int n) {
        if (n == 1) {
            return x;
        }
        int pow = power(x, n / 2);
        int powsq = pow * pow;
        if (n % 2 != 0) {
            return x * powsq;
        }
        return powsq;
    }

    public static void main(String[] args) {
        System.out.println("> " + power(2, 3));
    }
}
