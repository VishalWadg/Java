import java.util.ArrayList;
public class GraphPracticQSet2Q1 {
    public static void addEdge(int u, int v, ArrayList<ArrayList<Integer>> adj) {
        adj.get(u).add(v);
    }
    public static void dfsUtil(ArrayList<ArrayList<Integer>> adj, int v, boolean vis[]) {
        vis[v] = true;
        for (ArrayList<Integer> arr : adj) {
            for (int x : arr) {
                if (!vis[x]) {
                    dfsUtil(adj, x, vis);
                }
            }
        }
    }
    public static int motherVertex(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean vis[] = new boolean[V];
        int v = -1;
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfsUtil(adj, i, vis);
                v = i;
            }
        }
        boolean check [] = new boolean[V];
        dfsUtil(adj, v, check);
        for (int i = 0; i < check.length; i++) {
            if (!check[i]) {
                return -1;
            }
        }
        return v;
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(0, 1,adj);
        addEdge(0, 2,adj);
        addEdge(1, 3,adj);
        addEdge(4, 1,adj);
        addEdge(6, 4,adj);
        addEdge(5, 6,adj);
        addEdge(5, 2,adj);
        addEdge(6, 0,adj);
        System.out.println("The mother vertex is " + motherVertex(adj, V));
    }
}
