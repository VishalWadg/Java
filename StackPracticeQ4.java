import java.util.Stack;

public class StackPracticeQ4 {
    public static int trapRain(int heights[]) {
        int n = heights.length;
        Stack<Integer> lefB = new Stack<>();
        // Stack<Integer> rigB = new Stack<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int curr = heights[i];
            while (!lefB.isEmpty() && curr > heights[lefB.peek()]) {
                int popEle = heights[lefB.pop()];
                if (lefB.isEmpty()) {
                    break;
                }
                int distance = i - lefB.peek() - 1;
                int minHight = Math.min(curr,heights[lefB.peek()]) - popEle;
                ans += distance * minHight;
            }
            lefB.push(i);
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int ans = trapRain(arr);
        System.out.println(" > " + ans);
    }
}
