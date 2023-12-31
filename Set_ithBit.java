public class Set_ithBit {
    public static int set(int n, int i) {
        int BitMask = (1 << i);
        n = (n | BitMask);
        return n;
    }
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        System.out.println("> " + set(n, i));
    }
}
