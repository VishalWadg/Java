public class ClearLast_iBits {
    public static int clear(int n, int i) {
        int BitMask = (~0 << i+1);
        return n & BitMask;
    }
    public static void main(String[] args) {
        int n = 15;
        int i = 0;
        System.out.println("> " + clear(n, i));
    }
}
