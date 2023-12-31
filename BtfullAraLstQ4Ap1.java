import java.util.ArrayList;

public class BtfullAraLstQ4Ap1 {
    public static ArrayList<Integer> beautifull(int n) {
        ArrayList<Integer>ans = new ArrayList<>();
        ans.add(1);
        for (int i = 2; i <= n; i++) {
            ArrayList<Integer>temp = new ArrayList<>();
            for (Integer elem : ans) {
                if (2 * elem <= n) {
                    temp.add(2 * elem);
                }
            }
            for (Integer elem : ans) {
                if (2 * elem - 1 <= n) {
                    temp.add(2 * elem - 1);
                }
            }
            ans = temp;  
        }
        return ans;
    }
    public static void main (String args[]) {
        int n = 9;
        System.out.print(beautifull(n));
    }
}
