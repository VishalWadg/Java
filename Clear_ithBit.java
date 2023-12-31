public class Clear_ithBit {
    public static int clear(int n, int i) {
        int BitMask = ~(1 << i);
        n = (n & BitMask);
        return n;
    }
    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        System.out.println("> " + clear(n, i));
    }
}
