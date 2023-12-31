import java.util.ArrayList;
import java.util.Stack;
public class GrpahStronglyConnectedComponents {
    static class Edge{
        int src, dest;
        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    
    }

    public static void dfs(ArrayList<Edge> graph[], boolean vis[], int curr) {
        vis[curr] = true;
        System.out.print(curr + " ");
        for (Edge ed : graph[curr]) {
            if (!vis[ed.dest]) {
                dfs(graph, vis, ed.dest);
            }
        }
    }

    public static void topSort(ArrayList<Edge> graph[], boolean vis[], Stack<Integer> st, int curr) {
        vis[curr] = true;
        for (Edge ed : graph[curr]) {
            if (!vis[ed.dest]) {
                topSort(graph, vis, st, ed.dest);
            }
        }
        st.push(curr);
    }

    public static void kosarajuAlgo(ArrayList<Edge> graph[], int V) {
        // step 1
        boolean vis[] = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topSort(graph, vis, st, i);
            }
        }
        // step 2
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            vis[i] = false;
            transpose[i] = new ArrayList<>();
        }
        for (int i = 0; i < V; i++) {
            for (Edge ed : graph[i]) {
                transpose[ed.dest].add(new Edge(ed.dest, ed.src));
            }
        }
        // step 3
        while (!st.isEmpty()) {
            int curr = st.pop();
            if (!vis[curr]) {
                System.out.print("SCC > ");
                dfs(transpose, vis, curr);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));
        kosarajuAlgo(graph, v);
    }
}
