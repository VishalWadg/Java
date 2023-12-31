import java.util.Stack;
public class MaxAreaHistogram {
    public static int maxHistoArea(int heights[]) {
        int n = heights.length;
        int lse[] = new int [n];
        int rse[] = new int [n];
         Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            int curr = heights[i];
            while (!s.isEmpty() && curr <= heights[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                lse[i] = -1;
            } else {
                lse[i] = s.peek();
            }
            s.push(i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int curr = heights[i];
            while (!s.isEmpty() && curr <= heights[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                rse[i] = n;
            } else {
                rse[i] = s.peek();
            }
            s.push(i);
        }
        int currArea = 0;
        int maxAre = 0;
        for (int i = 0; i < n; i++) {
            int height = heights[i];
            int width = rse[i] - lse[i] - 1;
            currArea = height * width;
            maxAre = Math.max(maxAre, currArea);
        }
        return maxAre;
    }
    public static void main(String args[]) {
        int heights [] = {2, 1, 5, 6, 2, 3};
        int ans = maxHistoArea(heights);
        System.out.print(" > " + ans);
    }
}
