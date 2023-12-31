import java.util.ArrayList;
public class ConatainerWithMostWater {
    public static void mostwater(ArrayList<Integer>list) {

        int maxwater = 0;
        int lp = 0, rp = list.size() - 1;
        while (lp < rp) {
            int hight = Math.min(list.get(rp), list.get(lp));
            int width = rp - lp;
            int currwtr = hight * width;
            maxwater = Math.max(maxwater, currwtr);
            if (lp < rp) {
                lp++;
            } else {
                rp--;
            }
        }
        System.out.print("> " + maxwater);
    }
    public static void main(String args[]) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        mostwater(list);
    }
}
