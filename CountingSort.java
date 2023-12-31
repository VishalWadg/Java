public class CountingSort {
    public static void sorting(int arr[]) {
        int maxel = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxel = Math.max(maxel, arr[i]);
        }
        int counter[] = new int [maxel + 1];
        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < counter.length; i++) {
            while (counter[i] > 0) {
                arr[j] = i;
                counter[i]--;
                j++;
                
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 3, 8, 9, 7, 1, 1};
        sorting(arr);
    }
}