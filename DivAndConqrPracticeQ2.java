import java.lang.annotation.Target;

public class DivAndConqrPracticeQ2 {
    public static int majoritycount(int arr[], int si, int ei) {
        if (si == ei) {
            return arr[si];
        }
        int  mid = (si + ei) / 2;
        int left = majoritycount(arr, si, mid);
        int right = majoritycount(arr, mid + 1, ei);
        if (left == right) {
            return right;
        }
        return counting(arr, si, ei, left) > counting(arr, si, ei, right) ? left : right;
    }
    public static int counting(int arr[], int si, int ei, int key) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]) {
        int [] nums = {2,1,2,1,1,2,2};
        int majorityelement = majoritycount(nums, 0, nums.length - 1);
        System.out.print("Majority Element > " + majorityelement);
    }
}
