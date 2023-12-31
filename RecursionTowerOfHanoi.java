public class RecursionTowerOfHanoi {
    public static void hanoi(int n, String srce, String hlpr, String dstn) {
        if (n == 1) {
            System.out.println("move disc " + n + " from " + srce + " to " + dstn);
            return;
        }
        hanoi(n - 1, srce, dstn, hlpr);
        System.out.println("move disck " + n + " from " + srce + " to " + dstn);
        hanoi(n - 1, hlpr, srce, dstn);
    }
    public static void main(String[] args) {
        int n = 3;
        hanoi(n, "A", "B", "C");
    }
}
