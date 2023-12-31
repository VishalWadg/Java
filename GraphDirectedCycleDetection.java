import java.util.ArrayList;
public class GraphDirectedCycleDetection {
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

    public static boolean cycleDetection(ArrayList<Edge> graph []) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (cycleDetectionUtil(i, stack, graph, vis)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean cycleDetectionUtil(int curr, boolean stack[], ArrayList<Edge> graph [], boolean vis []) {
        vis[curr] = true;
        stack[curr] = true;
        for (Edge ed : graph[curr]) {
            if (stack[ed.dest]) {
                return true;
            }
            if (!vis[ed.dest]) {
                if(cycleDetectionUtil(ed.dest, stack, graph, vis)) {
                    return true;
                }
            }
        }
        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph [] = new ArrayList[4];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // graph[0].add(new Edge(0, 1, 0));
        // graph[0].add(new Edge(0, 2, 0));
        // graph[0].add(new Edge(0, 3, 0));

        graph[1].add(new Edge(1, 0, 0));
        // graph[1].add(new Edge(1, 2, 0));

        graph[2].add(new Edge(2, 0, 0));
        // graph[2].add(new Edge(2, 1, 0));
        graph[2].add(new Edge(2, 3, 0));

        graph[3].add(new Edge(3, 0, 0));
        
        // graph[4].add(new Edge(4, 2, 0));


        System.out.println(" > " + cycleDetection(graph));

    }
}
