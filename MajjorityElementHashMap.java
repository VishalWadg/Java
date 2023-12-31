import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;
public class MajjorityElementHashMap {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 2, 4, 1, 3, 8, 9, 11, 3, 4, 3, 4, 2};
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        //     int num = arr[i];
        //     if (hm.containsKey(arr[i])) {
        //         hm.put(num, hm.get(arr[i]) + 1);
        //     } else {
        //         hm.put(arr[i], 1);
        //     }
        // }
        
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        for (Integer key : hm.keySet()) {
            int freq = hm.get(key);
            if (freq > 1) {
                System.out.print(key + " ");
            }
        }        
    }
}
