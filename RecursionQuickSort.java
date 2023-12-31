public class RecursionQuickSort {
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // last elemetn 
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx-1);
        quickSort(arr, pidx+1, ei);
    }
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5}; 
        quickSort(arr, 0, arr.length-1);
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
