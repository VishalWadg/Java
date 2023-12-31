import java.util.ArrayList;
import java.util.Stack;
public class GraphTopologicalSortingDFS {
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

    public static void topSort(ArrayList<Edge> graph []) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topSortUtil(i, vis, st, graph);
            }
        }
        while (!st.empty()) {
            System.out.print(st.pop() + " ");
        }
    }

    public static void topSortUtil(int curr, boolean vis [], Stack<Integer>st, ArrayList<Edge> graph []) {
        vis[curr] = true;
        for (Edge ed : graph[curr]) {

            if (!vis[ed.dest]) {
                topSortUtil(ed.dest, vis, st, graph);
            }
        }
        st.push(curr);
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph [] = new ArrayList[6];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3, 0));

        graph[3].add(new Edge(3, 1, 0));
        
        graph[4].add(new Edge(4, 0, 0));
        graph[4].add(new Edge(4, 1, 0));

        graph[5].add(new Edge(5, 0, 0));
        graph[5].add(new Edge(5, 2, 0));


        topSort(graph);

    }
}