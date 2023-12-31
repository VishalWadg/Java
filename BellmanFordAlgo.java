import java.util.ArrayList;
public class BellmanFordAlgo {
    static class Edge{
        int src, dest, wt;
        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void bellmmanFord(ArrayList<Edge>graph, int src, int ver) {
        int dist[] = new int[ver];
        for (int i = 0; i < ver; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        for (int j = 0; j < ver - 1; j++) {
                for (Edge ed : graph) {
                    int u = ed.src;
                    int v = ed.dest;
                    int wt = ed.wt;
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                        dist[ed.dest] = dist[u] + ed.wt;
                    }
                }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph = new ArrayList<>();
        int v = 5;
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, -4));
        graph.add(new Edge(2, 3, 2));
        graph.add(new Edge(3, 4, 4));
        graph.add(new Edge(4, 1, -1));
        bellmmanFord(graph, 0, v);
    }
}
