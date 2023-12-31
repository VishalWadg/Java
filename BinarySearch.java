import java.util.*;

public class BinarySearch {
    public static int search(int arr[], int key) {
        int mid, start = 0, end = arr.length - 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 6, 9, 13, 15, 23, 77, 98 };
        System.out.println("Enter the key :  ");
        int key = sc.nextInt();
        int index = search(arr, key);
        if (index == -1) {
            System.out.println("NOT FOUND !");
        } else {
            System.out.println("The index of the key is : " + index);
        }
        sc.close();
    }
}
