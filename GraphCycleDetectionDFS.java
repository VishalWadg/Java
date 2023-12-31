import java.util.ArrayList;
public class GraphCycleDetectionDFS {
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
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (cycleDetectionUtil(i, -1, graph, vis)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean cycleDetectionUtil(int curr, int par, ArrayList<Edge> graph [], boolean vis []) {
        vis[curr] = true;
        for (Edge ed : graph[curr]) {

            // case 3 :
            if (!vis[ed.dest]) {
                if (cycleDetectionUtil(ed.dest, curr, graph, vis)) {  // IMP
                    return true;  
                }
            } else if (vis[ed.dest] && ed.dest != par) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph [] = new ArrayList[5];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 2, 0));
        graph[0].add(new Edge(0, 3, 0));

        graph[1].add(new Edge(1, 0, 0));
        graph[1].add(new Edge(1, 2, 0));

        graph[2].add(new Edge(2, 0, 0));
        graph[2].add(new Edge(2, 1, 0));
        graph[2].add(new Edge(2, 4, 0));

        graph[3].add(new Edge(3, 0, 0));
        
        graph[4].add(new Edge(4, 2, 0));


        System.out.println(" > " + cycleDetection(graph));

    }
}
