public class Update_ithBit {
    public static int clear(int n, int i) {
        int BitMask = ~(1 << i);
        n = (n & BitMask);
        return n;
    }
    public static int set(int n, int i) {
        int BitMask = (1 << i);
        n = (n | BitMask);
        return n;
    }
    public static int update(int n, int i, int newbit) {
        n = clear(n, i);
        int BitMask = newbit << i;
        return (n | BitMask); 
    }
    public static void main(String[] args) {
        int n = 11;
        int i = 2;
        int newbit = 1;
        System.out.println("> " + update(n, i, newbit));
    }
}
