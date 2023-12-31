public class Recursion_NumsIn_DecreasingOrder {
    public static void decrdrder(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        decrdrder(n-1);
    }
    public static void main(String[] args) {
        int n = 25;
        decrdrder(n);
    }
}
