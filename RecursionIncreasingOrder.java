public class RecursionIncreasingOrder {
    public static void incorder(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        incorder(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 25;
        incorder(n);
    }
}
