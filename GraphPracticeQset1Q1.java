import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
public class GraphPracticeQset1Q1 {
    static class Edge {
        int src;
        int dest;
        public Edge (int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    public static void addEdge(ArrayList<Integer> adj[], int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }
    public static boolean bfsCycleDetectionUtil(ArrayList<Integer> graph[], int src, int v, boolean vis[]) {
        Queue<Integer> pq = new LinkedList<>();
        int par [] = new int[v];
        Arrays.fill(par, -1);
        pq.add(src);
        vis[src] = true;
        while (!pq.isEmpty()) {
            int curr = pq.remove();
            for (int i = 0; i < graph[curr].size(); i++) {
                int neigh = graph[curr].get(i);
                if (!vis[neigh]) {
                    vis[neigh] = true;
                    par[neigh] = curr;
                    pq.add(neigh);
                } else if (par[curr] != neigh) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean bfsCycleDetection (ArrayList<Integer> graph[]) {
        int v = graph.length;
        boolean vis [] = new boolean[v];
        Arrays.fill(vis, false);
        for (int i = 0; i < v; i++) {
            if (!vis[i] && bfsCycleDetectionUtil(graph, i, v, vis)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> graph[] = new ArrayList[5];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        // addEdge(graph, 2, 4);
        addEdge(graph, 4, 3);
        boolean iscyc = bfsCycleDetection(graph);
        if (iscyc) {
            System.out.println(" > Yes");
        } else {
            System.out.println(" > No");
        }
    }
}
