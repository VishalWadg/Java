import java.util.Collections;
import java.util.ArrayList;
public class ArrayListPracticeQ3 {
    public static int findkeytarget(ArrayList<Integer>list , int key) {
        ArrayList<Integer>targets = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == key ) {
                targets.add(list.get(i + 1));
            }
        }
        Collections.sort(targets);
        int count  = 1, target = 0;
        int maxcount = Integer.MIN_VALUE;
        for (int i = 0; i < targets.size() - 1; i++) {
            int a = targets.get(i);
            int b = targets.get(i + 1);
            if (a == b) {
                count ++;
            } else {
                count = 1;
            }

            if (count > maxcount) {
                maxcount = count;
                target = a;
            }
        }
        return target;
    }
    public static void main(String args[]) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        // list.add(1);
        // list.add(200);
        // list.add(1);
        // list.add(200);
        // list.add(1);
        // list.add(200);
        System.out.print(findkeytarget(list, 2));
    }
}
