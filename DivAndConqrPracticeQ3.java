public class DivAndConqrPracticeQ3 {
    // We have to find inversion count of the array using divide and conquer (hint : use merge sort algorithm)
    public static int invcount(int arr[], int si, int ei) {
        int count = 0;
        if (ei > si) {
            int mid = si + (ei - si) / 2;
            count = invcount(arr, si, mid);
            count += invcount(arr, mid + 1, ei);
            count += merge(arr, si, mid + 1, ei);
        }
        return count;
    }
    public static int merge(int arr[], int si, int mid, int ei) {
        int i = si, j = mid, k = 0, count = 0;
        int temp [] = new int[ei - si + 1];
        while (i < mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k]= arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
                count += (mid - i);
            }
        }
        // left part
        while (i < mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        // right part
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        // copying temp to arr
        for (i = si, k = 0; i <= ei; i++, k++) {
            arr[i] = temp[k];
        }
        return count;
    }


    public static void main (String args[]) {
        int arr[ ] = {2, 4, 1, 3, 5};
        System.out.print("Inversion Count > " + invcount(arr, 0, arr.length - 1));
    }
}
