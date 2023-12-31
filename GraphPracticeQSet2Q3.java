import java.util.ArrayList;
import java.util.Vector;
public class GraphPracticeQSet2Q3 {
    static class Pairs {
        int first, second;
        public Pairs(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static int[] caclIndegree(ArrayList<ArrayList<Integer>> graph) {
        int indeg[] = new int[graph.size()];
        for (ArrayList<Integer> arr : graph) {
            for (int x : arr) {
                indeg[x]++;
            }
        }
        return indeg;
    }

    public static ArrayList<ArrayList<Integer>> createGraph(Vector<Pairs>Prereq, int v) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        for (Pairs pr : Prereq) {
            graph.get(pr.second).add(pr.first);
        }
        return graph;
    }

    public static boolean canComplete(Vector<Pairs> prerequisite, int v) {
        ArrayList<ArrayList<Integer>> graph = createGraph(prerequisite, v);
        int indeg[] = caclIndegree(graph);
        int  j = 0;
        for (int i = 0; i < v; i++) {
            j = 0;
            for (; j < v; j++) {
                if (indeg[j] == 0) {
                    break;
                }
            }
            if (j == v) {
                return false;
            }
            indeg[j] = -1;
            for (int x : graph.get(j)) {
                indeg[x]--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
      Vector<Pairs> prerequisite = new Vector<Pairs>();
      prerequisite.add(new Pairs(0, 1));  
      prerequisite.add(new Pairs(0, 3)); 

      prerequisite.add(new Pairs(1, 3));  

      prerequisite.add(new Pairs(2, 0));  
      prerequisite.add(new Pairs(2, 3));  
      prerequisite.add(new Pairs(2, 4)); 

      prerequisite.add(new Pairs(3, 4));  
    //   prerequisite.add(new Pairs(4, 2));  
      if (canComplete(prerequisite, 5)) {
        System.out.println("Can complete all of the tasks!");
      } else {
        System.out.println("Can't complete all of the tasks!");
      }
    }
}
