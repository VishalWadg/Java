import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class IndianCoins {
    public static void main(String args[]) {
        int value = 1059;
        Integer dnom [] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        Arrays.sort(dnom, Comparator.reverseOrder());
        int count = 0;
        ArrayList<Integer> change = new ArrayList<>();
        for (int i = 0; i < dnom.length; i++) {
            
                while (value >= dnom[i]) {
                    count++;
                    value -= dnom[i];
                    change.add(dnom[i]);
                }
        }
        System.out.println("Total (min) coins used > " + count);
        for(int i = 0; i < change.size(); i++) {
            System.out.print(change.get(i) + " ");
        }
    }
}
