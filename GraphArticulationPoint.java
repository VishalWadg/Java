import java.util.ArrayList;
public class GraphArticulationPoint {
    static class Edge {
        int src, dest;
        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[], boolean ap[], int par, int dt[], int low[], int time) {
        int children = 0;
        dt[curr] = low[curr] = ++time;
        vis[curr] = true;
        for (Edge ed : graph[curr]) {
            if(ed.dest == par) {
                continue;
            } else if(vis[ed.dest]) {
                low[curr] = Math.min(low[curr], dt[ed.dest]);
            } else {
                dfs(graph, ed.dest, vis, ap, curr, dt, low, time);
                low[curr] = Math.min(low[curr], low[ed.dest]);
                if(par != -1 && dt[curr] <= low[ed.dest]) {
                    ap[curr] = true;
                }
                children++;  // curr -> child  -> +1
            }
        }
        if (par == -1 && children > 1) {
            ap[curr] = true;
        }
    }

    public static void tarjansAP(ArrayList<Edge> graph[], int v) {
        boolean vis[] = new boolean[v];
        boolean ap[] = new boolean[v];
        int dt[] = new int[v];
        int low[] = new int[v];
        int time = 0;
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                dfs(graph, i, vis, ap, -1, dt, low, time);
            }
        }
        for (int i = 0; i < v; i++) {
            if (ap[i]) {
                System.out.println("A.P. > " + i);
            }
        } 
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph []= new ArrayList[v];
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

        graph[4].add(new Edge(4, 3));
        tarjansAP(graph, v);
    }
}
