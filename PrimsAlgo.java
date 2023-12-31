import java.util.ArrayList;
import java.util.PriorityQueue;
public class PrimsAlgo {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    static class Pair implements Comparable<Pair>{
        int v;
        int cst;
        public Pair(int v, int cst) {
            this.v = v;
            this.cst = cst;
        }
        @Override
        public int compareTo(Pair pr1) {
            return this.cst - pr1.cst;
        }
    }

    public static int prims(ArrayList<Edge> graph[], int src) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        int mincst = 0;
        boolean vis[] = new boolean[graph.length];
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.v]) {
                vis[curr.v] = true;
                mincst += curr.cst;
                for (Edge ed : graph[curr.v]) {
                    pq.add(new Pair(ed.dest, ed.wt));
                }
            }
        }
        return mincst;
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[5];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
        System.out.println(prims(graph, 0));
    }
}
