import java.util.ArrayList;
import java.util.Collections;
public class ArrayListPracticeQ2 {
    public static ArrayList<Integer> findloner(ArrayList<Integer>list) {
        ArrayList<Integer>loners = new ArrayList<>();
        Collections.sort(list);
        for (int i = 1; i < list.size() - 1; i++) {
            int a = list.get(i);
            if (list.get(i - 1) + 1 < a && a + 1 < list.get(i + 1)) {
                loners.add(a);
            }  
        }
        if(list.size() == 1) {
            loners.add(list.get(0));
        }
        if (list.size() > 1) {
            if (list.get(0) + 1 < list.get(1)) {
                loners.add(list.get(0));
            }
            if (list.get(list.size() - 2) + 1 < list.get(list.size() - 1)) {
                loners.add(list.get(list.size() - 1));
            }
        }
        return loners;
    }
    public static void main(String args[]) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.print(findloner(list));
    }
}
