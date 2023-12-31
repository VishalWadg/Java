public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            // Swap
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 9, 4, 7, 3, 6, 2};
        selectionSort(arr);
    }
}

