import java.util.ArrayList;
public class GraphBridge {
    static class Edge{
        int src, dest;
        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void dfs(ArrayList<Edge> graph[], boolean vis[], int curr, int par, int dt[], int low[], int time) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        for (Edge ed : graph[curr]) {
            if (ed.dest == par) {
                continue;
            } else if(!vis[ed.dest]) {
                dfs(graph, vis, ed.dest, curr, dt, low, time);
                low[curr] = Math.min(low[curr], low[ed.dest]);
                if (dt[curr] < low[ed.dest]) {
                    System.out.println("Bridge > " + curr + " --- " + ed.dest);
                }
            } else {
                low[curr] = Math.min(low[curr], dt[ed.dest]);
            }
        }
    }

    public static void tarjansBridge(ArrayList<Edge> graph[], int v) {
        boolean vis[] = new boolean[v];
        int dt[] = new int [v];
        int low[] = new int [v];
        int time = 0;
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                dfs(graph, vis, i, -1, dt, low, time);
            }
        }
    }

    public static void main(String args[]) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));               
        graph[1].add(new Edge(1, 2));               

        graph[2].add(new Edge(2, 0));               
        graph[2].add(new Edge(2, 1));     

        graph[3].add(new Edge(3, 0));               
        graph[3].add(new Edge(3, 4));               
        // graph[3].add(new Edge(3, 5));          

        graph[4].add(new Edge(4, 3));               
        // graph[4].add(new Edge(4, 5));             

        // graph[5].add(new Edge(5, 3));               
        // graph[5].add(new Edge(5, 4));    
        tarjansBridge(graph, v);           
    }
}
