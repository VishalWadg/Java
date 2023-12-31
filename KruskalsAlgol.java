import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class KruskalsAlgol {
    static int n = 4;
    static int par[] = new int[n];
    static int rank[] = new int[n];
    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;
        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
        @Override
        public int compareTo(Edge e2) {
            return this.wt - e2.wt;
        }
    }
    public static void init() {
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }
    public static int find(int x) {
        if (par[x] == x) {
            return x;
        }
        return par[x] = find(par[x]);
    }
    public static void union (int a, int b) {
        int parA = find(a);
        int parB = find(b);
        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if(rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }
    public static int kruskalsMST(ArrayList<Edge>graph) {
        int count = 0;
        int cost = 0;
        int v = n;
        Collections.sort(graph);
        for (int i = 0; count < v - 1; i++) {
            Edge curr = graph.get(i);
            int a = find(curr.src);
            int b = find(curr.dest);
            if (a != b) {
                union(curr.src, curr.dest);
                cost += curr.wt;
                count++;
            }
        }
        return cost;
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph = new ArrayList<>();
        graph.add(new Edge(0, 1, 10));
        graph.add(new Edge(0, 2, 15));
        graph.add(new Edge(0, 3, 30));
        graph.add(new Edge(1, 3, 40));
        graph.add(new Edge(2, 3, 50));
        init();
        System.out.println(kruskalsMST(graph));
    }
}
