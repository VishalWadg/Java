public class HeapSortAlgo {

    public static void heapifymx(int arr[], int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }

        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;                              // ith mazykadun mistake zali hot i.e. maxIdx = left  kela hota me
        }

        if (maxIdx != i) {

            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            heapifymx(arr, maxIdx, size);
        }

    }
    public static void heapSortAsc(int arr[]) {
        int n = arr.length;

        for (int i = n/2; i >= 0; i--) {
            heapifymx(arr, i, n);
        }

        for (int i = n - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapifymx(arr, 0, i);
        }

    }

    public static void heapifymn(int arr[], int i, int size) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int minIdx = i;

        if (left < size && arr[minIdx] > arr[left]) {
            minIdx = left;
        }

        if (right < size && arr[minIdx] > arr[right]) {
            minIdx = right;
        }

        if (minIdx != i) {
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            heapifymn(arr, minIdx, size);
        }
    }

    public static void heapSortDesc(int arr[]) {
        int n = arr.length;

        for (int i = n/2; i >= 0; i--) {
            heapifymn(arr, i, n);
        }

        for (int i = n - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapifymn(arr, 0, i);
        }

    }

    public static void main(String[] args) {
        int arr[] = {9, 1, 4, 2, 3, 7, 5, 8, 6, 11, 10};
        heapSortDesc(arr);
        // heapSortAsc(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
