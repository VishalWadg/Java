import java.util.*;

public class ReverseArray {
    public static void reverse(int arr[]) {
        int temp, start = 0, end = arr.length - 1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 6, 9, 13, 15, 23, 77, 98 };
        reverse(arr);
        int i = 0;
        System.out.println("The Reversed array is : ");
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        sc.close();
    }
}
