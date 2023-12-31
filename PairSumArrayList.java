import java.util.*;
public class PairSumArrayList {
    public static boolean checksum(ArrayList<Integer>list, int target) {
        int bp = -1;  // invalid index ne initialize kela
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
            }
        }
        int n = list.size();
        int rp = bp;
        int lp = bp + 1;
        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);
            if (sum == target) {
                return true;
            } else if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp -1) % n;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.print(" > " + checksum(list, 20));
    }
}

