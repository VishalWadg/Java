public class MaxSumSubarray {
    public static void maxsumusingprefix(int arr[]) {
        int prefix[] = new int[arr.length];
        int currentsum = 0, maxsum = 0;
        prefix[0] = arr[0];
        for (int j = 1; j < arr.length; j++) {
            prefix[j] = prefix[j - 1] + arr[j];
        }
        for (int i = 0; i < arr.length; i++) {
            currentsum = 0;
            for (int j = i; j < arr.length; j++) {
                currentsum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (currentsum > maxsum) {
                    maxsum = currentsum;
                }
            }
        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        maxsumusingprefix(arr);
    }
}
