import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class GraphConnectedComponentsDFSBFS {
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

    public static void dfs(ArrayList<Edge> graph []) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                dfsUtil(i, graph, vis);
            }
        }
    }

    public static void dfsUtil(int curr, ArrayList<Edge> graph [], boolean vis []) {
        System.out.print(curr + " ");
        vis[curr] = true;
        for (Edge ed : graph[curr]) {
            if (!vis[ed.dest]) {
                dfsUtil(ed.dest, graph, vis);
            }
        }
    }

    public static void bfs(ArrayList<Edge> graph []) {
        boolean vis [] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                bfsUtil(i, graph, vis);
            }
        }
    }

    public static void bfsUtil(int src, ArrayList<Edge> graph [], boolean vis[]) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(src);
        while (!qu.isEmpty()) {
            int curr = qu.remove();
            if (!vis[curr]) {
                vis[curr] = true;
                System.out.print(curr + " ");
                for (Edge ed : graph[curr]) {
                    qu.add(ed.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph [] = new ArrayList[7];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 2, 0));

        graph[1].add(new Edge(1, 0, 0));

        graph[2].add(new Edge(2, 0, 0));
        graph[2].add(new Edge(2, 3, 0));

        graph[3].add(new Edge(3, 2, 0));
        
        graph[4].add(new Edge(4, 5, 0));

        graph[5].add(new Edge(5, 4, 0));
        graph[5].add(new Edge(5, 6, 0));

        graph[6].add(new Edge(6, 5, 0));

        dfs(graph);
        System.out.println();
        bfs(graph);

    }
}
