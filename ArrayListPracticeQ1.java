import java.util.ArrayList;


// Difficulty level - EASY

public class ArrayListPracticeQ1 {
    public static boolean ismonotone(ArrayList<Integer>list) {
        int asc = 0, desc = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if(list.get(i) <= list.get(i + 1)) {
                asc ++;
            }
            if (list.get(i) >= list.get(i + 1)) {
                desc++;
            }
        }
        if (asc == list.size() - 1 || desc == list.size() - 1) {
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        boolean b = ismonotone(list);
        System.out.println(" > " + b);
    }    
}
