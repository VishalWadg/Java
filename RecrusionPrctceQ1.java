public class RecrusionPrctceQ1 {
    public static void keyidxs(int arr[], int idx, int key) {
        if (idx == arr.length) {
            return;
        }
        if (arr[idx] == key) {
            System.out.println("> " + idx);
        }
        keyidxs(arr, idx + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = {2,9,6,9,0,9,10,7,9,5,9,2,3};
        int key = 9;
        keyidxs(arr, 0, key);
    }
}
