import java.util.HashSet;
public class IntersectHashSet {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> hs = new HashSet<>();
        for (int el : arr1) {
            hs.add(el);
        }
        for (int el : arr2) {
            hs.add(el);
        }
        System.out.print("Union > ");
        for (Integer el : hs) {
            System.out.print(el);
        }
        int union = hs.size();
        hs.clear();
        for (int el : arr1) {
            hs.add(el);
        }
        int interCount = 0;
        for (int el : arr2) {
            if (hs.contains(el)) {
                interCount++;
                hs.remove(el);
            }
        }
        System.out.print("Union > " + union + " Intersection > " + interCount);
    }
}
