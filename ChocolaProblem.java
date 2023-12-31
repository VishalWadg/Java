import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ChocolaProblem {
    public static void main(String args[]) {
        Integer vertical[] = { 2, 1, 3, 1, 4 };
        Integer horizontal[] = { 4, 1, 2 };
        Arrays.sort(vertical, Comparator.reverseOrder());
        Arrays.sort(horizontal, Comparator.reverseOrder());
        int vp = 1, hp = 1, vc = 0, hc = 0, h = 0, v = 0;
        int cost = 0;
        while (v < vertical.length && h < horizontal.length) {
            if (vertical[v] >= horizontal[h]) {
                cost += vertical[v] * hp;
                v++;
                vp++;
            } else {
                cost += horizontal[h] * vp;
                h++;
                hp++;
            }
        }
        while (v < vertical.length) {
            cost += vertical[v] * hp;
            v++;
            vp++;
        }
        while (h < horizontal.length) {
            cost += horizontal[h] * vp;
            h++;
            hp++;
        }
        System.out.println("> " + cost);
    }
}