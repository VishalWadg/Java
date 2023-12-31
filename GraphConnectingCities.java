import java.util.ArrayList;
import java.util.PriorityQueue;
public class GraphConnectingCities {
    static class Edge implements Comparable<Edge>{
        int dest;
        int wt;
        public Edge (int dest, int wt){
            this.dest = dest;
            this.wt = wt;
        }
        @Override
        public int compareTo(Edge o) {
            return this.wt - o.wt;
        }
    }
    public static void connectCities(int cities[][]) {
        boolean vis[] = new boolean[cities.length];
        int finans = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(0, 0));
        while (!pq.isEmpty()) {
            Edge cur = pq.remove();
            if (!vis[cur.dest]) {
                vis[cur.dest] = true;
                finans += cur.wt;
                for (int i = 0; i < cities[cur.dest].length; i++) {
                    if(cities[i][cur.dest] != 0) {
                        pq.add(new Edge(i, cities[cur.dest][i]));
                    }
                }
            }
        }
        System.out.println("> " + finans);
    }
    public static void main (String args[]) {
        int cities[][] = {{0, 1, 2, 3, 4},
                          {1, 0, 5, 0, 7},
                          {2, 5, 0, 6, 0},
                          {3, 0, 6, 0, 0},
                          {4, 7, 0, 0, 0}};
        connectCities(cities);
    }
}
