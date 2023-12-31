public class RecursionBinaryStringsProblem {
    public static void bnryStrng(int n, String str, int lastPlace) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        bnryStrng(n - 1, str + "0", 0);
        if (lastPlace == 0) {
            bnryStrng(n - 1, str + "1", 1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int lastPlace = 0;
        bnryStrng(n, "", lastPlace);
    }
}
