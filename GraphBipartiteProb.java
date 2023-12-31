import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class GraphBipartiteProb {
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

    public static boolean isBipartite(ArrayList<Edge> graph []) {
        int colr [] = new int[graph.length];
        for (int i = 0; i < colr.length; i++) {
            colr[i] = -1;
        }
        Queue<Integer> qu = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (colr[i] == -1) {
                qu.add(i);
                colr[i] = 0;
                while (!qu.isEmpty()) {
                    int curr = qu.remove();
                    for (Edge ed : graph[curr]) {
                        if (colr[ed.dest] == -1) {
                            colr[ed.dest] = colr[curr] == 0 ? 1 : 0;
                            qu.add(ed.dest);
                        } else if (colr[ed.dest] == colr[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
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
        // graph[3].add(new Edge(3, 4, 0));

        graph[5].add(new Edge(4, 2, 0));
        // graph[5].add(new Edge(4, 3, 0));

        System.out.println("> " + isBipartite(graph));

    }
}
