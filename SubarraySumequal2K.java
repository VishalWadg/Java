import java.util.HashMap;
public class SubarraySumequal2K {                                   // imp I had a hard time understanding this question
    public static int countSubarrayWithKSum (int arr[], int k) {
        int sum = 0, ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (hm.containsKey(sum - k)) {
                ans += hm.get(sum - k);
            }
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
        int ans = countSubarrayWithKSum(arr, -10);
        System.out.println("The num of subarrays with sum = 10 is > " + ans);
    }
}
