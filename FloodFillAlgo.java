public class FloodFillAlgo {
    public static void helper(int[][] image, int sr, int sc, int color, int oco) {
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || (image[sr][sc] == color || image[sr][sc] != oco)) {
            return;
        }
        image[sr][sc] = color;
        helper(image, sr, sc + 1, color, oco);
        helper(image, sr, sc - 1, color, oco);
        helper(image, sr + 1, sc, color, oco);
        helper(image, sr - 1, sc, color, oco);
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oco = image[sr][sc];
        helper(image, sr, sc, color, oco);
        return image;
    }
    public static void main(String[] args) {
        int image[][] = {{1, 1, 1},
                         {1, 1, 0},
                         {1, 0, 1}};
        floodFill(image, 0, 0, 2);
        for (int[] row : image) {
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
