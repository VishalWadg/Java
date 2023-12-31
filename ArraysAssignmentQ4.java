public class ArraysAssignmentQ4 {
    public static int answer(int height[]) {
        int TrpdWter = 0, Waterlevel = 0;
        int n = height.length;
        int leftMax[] = new int [n];
        int rightMax[] = new int [n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) { 
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax [i] = Math.max(rightMax[i+1], height[i]);
        }
        for (int i = 0; i < n; i++) {
            Waterlevel = Math.min(leftMax[i], rightMax[i]);
            if (Waterlevel - height[i] < 0) {
                continue;
            }
            TrpdWter += (Waterlevel - height[i]);
        }
        return TrpdWter; 
    }
    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("The traped rainwaterlevel is : " + answer(height));
    }
}