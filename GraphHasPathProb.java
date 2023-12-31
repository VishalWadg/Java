import java.util.ArrayList;
public class GraphHasPathProb {
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge (int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static boolean hasPath(int src, int dest, ArrayList<Edge> graph [], boolean vis []) {
        if (src == dest) {
            return true;
        }
        vis[src] = true;
        for (Edge ed : graph[src]) {
            if (!vis[ed.dest] && hasPath(ed.dest, dest, graph, vis)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph [] = new ArrayList[7];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 2, 0));

        graph[1].add(new Edge(1, 0, 0));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 0));
        graph[2].add(new Edge(2, 4, 0));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 4, 0));
        graph[3].add(new Edge(3, 5, 0));

        graph[4].add(new Edge(4, 2, 0));
        graph[4].add(new Edge(4, 3, 0));
        graph[4].add(new Edge(4, 5, 0));

        graph[5].add(new Edge(5, 3, 0));
        graph[5].add(new Edge(5, 4, 0));
        graph[5].add(new Edge(5, 6, 0));

        graph[6].add(new Edge(6, 5, 0));

        System.out.println(" > " + hasPath(0, 8, graph, new boolean[graph.length]));
    }
}
