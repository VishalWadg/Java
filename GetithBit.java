public class GetithBit {
    public static int get(int n, int i) {
        int BitMask = 1 << i;
        if ((n & BitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int i = 2;
        System.out.println(get(n, i));
    }
}
