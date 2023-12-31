import java.util.ArrayList;
public class BtfullAraLstQ4Ap2 {
    public static ArrayList<Integer>beautifull(int n) {
        ArrayList<Integer>res = new ArrayList();
        divideAndConquer(1, 1, res, n);
        return res;
    }
    private static void divideAndConquer(int start, int increament, ArrayList<Integer>res, int n) {
        if (start + increament > n) {
            res.add(start);
            return;
        }
        divideAndConquer(start, 2 * increament, res, n);
        divideAndConquer(start + increament, 2 * increament, res, n);
    }
    public static void main (String args[]) {
        int n = 9;
        System.out.print(beautifull(n));
    }
}
