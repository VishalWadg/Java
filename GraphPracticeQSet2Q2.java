import java.util.ArrayList;
public class GraphPracticeQSet2Q2 {
    static int n = 5;
    static int par[] = new int [n];
    static int rank[] = new int [n];
    public static int find(int x) {
        if (par[x] == x) {
            return x;
        }
        return find(par[x]);
    }
    public static void union(int x, int y){
        par[x] = y;
    }
    static class Edge {
        int src;
        int dest;
        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    public static int isCycle(ArrayList<Edge> graph, int V) {
        for (int i = 0; i < V; i++) {
            par[i] = i;
        }
        for (int i = 0; i < graph.size(); i++) {
            Edge curr = graph.get(i);
            int x = find(curr.src);
            int y = find(curr.dest);
            if(x == y){
                return 1;
            }
            union(x, y);
        }
        return 0;
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph = new ArrayList<>();
        graph.add(new Edge(0, 1));
        graph.add(new Edge(0, 2));
        graph.add(new Edge(3, 1));
        graph.add(new Edge(1, 4));
        graph.add(new Edge(3, 4));
        if (isCycle(graph, 5) == 1) {
            System.out.println("Cycle Exists");
        } else {
            System.out.println("Cycle doesent Exist");
        }
    }
}
