import java.util.ArrayList;
public class GraphDS {
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
    public static void main(String[] args) {
        ArrayList<Edge> graph [] = new ArrayList[5];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // vertex 0 
        graph[0].add(new Edge(0, 1, 5));

        // 1 vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 vertex
        graph[4].add(new Edge(4, 2, 2));

        // How to print neighbouring vertices / nodes of a given vertex / node

        System.out.print("Neighbours of 2 vertex are > ");
        for (Edge ed : graph[2]) {
            System.out.print(ed.dest + " ");
        }

    }
}
