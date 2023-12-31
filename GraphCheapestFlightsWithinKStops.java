import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class GraphCheapestFlightsWithinKStops {
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static class Info {
        int ver, cost, stops;
        public Info (int ver, int cost, int stops) {
            this.ver = ver;
            this.cost = cost;
            this.stops = stops;
        }
    }
    public static int cheapestFlight(ArrayList<Edge> graph[], int src, int dest, int k) {
        int dist[] = new int [graph.length];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        Queue<Info> qu = new LinkedList<>();
        qu.add(new Info(src, 0, 0));
        while (!qu.isEmpty()) {
            Info curr = qu.remove();
            if (curr.stops > k) {
                break;
            }
            for (Edge ed : graph[curr.ver]) {
                if (curr.cost + ed.wt < dist[ed.dest] && curr.stops <= k) {
                    qu.add(new Info(ed.dest, curr.cost + ed.wt, curr.stops + 1));
                    dist[ed.dest] = curr.cost + ed.wt;
                }
            }
        }
        return (dist[dest] == Integer.MAX_VALUE ? -1 : dist[dest] );
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph []= new ArrayList[4];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 6));

        graph[2].add(new Edge(2, 3, 2));


        int ans = cheapestFlight(graph, 0, 3, 1);
        if (ans == -1) {
            System.out.println("No flights possible");
        } else {
            System.out.println(" > " + ans);
        }
    }
}
