public class DivAndConqSortArryOfStrings {
    public static String[] sort(String arr[], int si, int ei) {
        if (si == ei) {
            String[] str = { arr[si] };
            return str;
        }
        int mid = si + (ei - si) / 2;
        String arr1[] = sort(arr, si, mid);
        String arr2[] = sort(arr, mid + 1, ei);
        String arr3[] = merge(arr1, arr2);
        return arr3;
    }

    static String[] merge(String arr1[], String arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        int k = 0;
        int i = 0;
        int j = 0;
        String temp[] = new String[m + n];
        while (i < m && j < n) {
            if (arr1[i].compareTo(arr2[j]) < 0) {
                temp[k] = arr1[i];
                i++;
                k++;
            } else {
                temp[k] = arr2[j];
                j++;
                k++;
            }
        }
        // left part
        while (i < m) {
            temp[k++] = arr1[i++];
        }
        // right part
        while (j < n) {
            temp[k++] = arr2[j++];
        }
        return temp;
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        arr = sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
