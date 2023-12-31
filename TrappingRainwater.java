public class TrappingRainwater {
    public static void rainwater(int arr[]) {
        int n = arr.length;
        int leftbound[] = new int[n];
        int rightbound[] = new int[n];
        leftbound[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftbound[i] = Math.max(arr[i], leftbound[i - 1]);
        }
        rightbound[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightbound[i] = Math.max(rightbound[i + 1], arr[i]);
        }
        int TrappedWater = 0;
        for (int i = 0; i < n; i++) {
            TrappedWater += Math.min(leftbound[i], rightbound[i]) - arr[i];
        }
        System.out.println("The traped water level is : " + TrappedWater);
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        rainwater(arr);
    }
}
