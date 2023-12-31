import java.util.PriorityQueue;
public class NearbyCars {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distsq;
        int i;
        Point(int x, int y, int distsq, int i) {
            this.x = x;
            this.y = y;
            this.distsq = distsq;
            this.i = i;
        }

        @Override 
        public int compareTo(Point p2) {
            return this.distsq - p2.distsq;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Point> pq = new PriorityQueue<>();
        int points [][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        for (int i = 0; i < points.length; i++) {
            int distsq = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
            pq.add(new Point(points[i][0], points[i][1], distsq, i));
        }

        while (k >= 1) {
            System.out.println("C" + pq.remove().i);
            k--;
        }
    }
}
