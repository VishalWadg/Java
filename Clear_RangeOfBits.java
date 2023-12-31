public class Clear_RangeOfBits {
    public static int clear(int n, int i, int j) {
        int BitMask = (~0 << i+1) | ((1 << j) - 1);
        return n & BitMask;
    }
    public static void main(String[] args) {
        int n = 15;
        int i = 2;
        int j = 1;
        System.out.println("> " + clear(n, i, j));
    }
}
