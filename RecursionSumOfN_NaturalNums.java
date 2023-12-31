public class RecursionSumOfN_NaturalNums {
    public static int add(int n) {
        if (n > 0) {
            return n * add(n-1);
        }
            return 1;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(add(n));
    }
}
