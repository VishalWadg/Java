public class KadanesAlgorithm {
    public static void kadanes(int arr[]) {
        int counter = 0, cs = 0, negms = Integer.MIN_VALUE, ms = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (arr[i] < 0) {
                negms = Integer.max(negms, arr[i]);
                counter++;
            }
            if (cs < 0) {
                cs = 0;
            }
            ms = Integer.max(ms, cs);
        }
        if (counter == arr.length) {
            System.out.println(negms);
        } else {
            System.out.println("The max sum of subarray is : " + ms);
        }
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, -4, -1, -2, -7, -10, -3 };
        kadanes(arr);
    }
}
