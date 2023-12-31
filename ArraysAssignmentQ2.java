import java.util.Scanner;

import javax.swing.text.ElementIterator;

public class ArraysAssignmentQ2 {
    public static int answer(int arr[], int key) {
        int minind = 0, maxind = 0, maxv = Integer.MIN_VALUE, minv = Integer.MAX_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxv) {
                maxv = Math.max(maxv, arr[i]);
                maxind = i;
            }
            if (arr [i] < minv) {
                minv = Math.min(minv, arr[i]);
                minind = i;
            }
        }
        int start = 0, end = 0;
        int mid = (start + end)/2;
        if (key >= arr[minind] && key <= arr[n-1]) {
            start = minind; 
            end = n-1;
        }else if (key <= arr[maxind] && key >= arr[0]) {
            start = 0;
            end = maxind;
        }
        while (start <= end) {
            mid = (start + end)/2;
            if (key == arr[mid]) {
                return mid;
            }
            else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }  
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key : ");
        int key = sc.nextInt();
        int arr[] = {5, 6, 7, 0, 1, 2, 4};
        System.out.println("The index of the given key is : " + answer(arr, key));
        sc.close();
    }
}
