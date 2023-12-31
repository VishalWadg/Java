import java.util.*;

public class LargestInArray {
    public static int find(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 34, 21, 7, 8, 9, 1 };
        int largest = find(arr);
        System.out.println("The largest element in the array is : " + largest);
        sc.close();
    }
}
