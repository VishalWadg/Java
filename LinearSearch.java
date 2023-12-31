import java.util.*;

public class LinearSearch {
    public static int search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 34, 21, 7, 8, 9, 1 };
        System.out.println("Enter the key :  ");
        int key = sc.nextInt();
        System.out.println(search(arr, key));
        sc.close();
    }
}
