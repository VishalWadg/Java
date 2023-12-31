import java.util.HashMap;
public class HashMapPracticeQuestion2 {
    static HashMap<Integer, Integer> hm = new HashMap<>();

    public static int [] sumElems(int arr[], int sum) {

        for (int i = 0; i < arr.length; i++) {
            int diff = sum - arr[i];
            if (hm.containsKey(diff)) {
                return new int [] {hm.get(diff), i};
            }
            hm.put(arr[i], i);
        }
        return new int [] {0, 0};
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int sum = 17;
        int ans[] = sumElems(arr, sum);
        System.out.println(" > " + ans[0] + ", " + ans[1]);
    }
}
