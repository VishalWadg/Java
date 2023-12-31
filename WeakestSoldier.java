import java.util.PriorityQueue;

public class WeakestSoldier{
    static class Row implements Comparable <Row> {
        int soldeirs;
        int idx;
        Row (int sd, int id) {
            this.soldeirs = sd;
            this.idx = id;
        }
        @Override
        public int compareTo (Row r2) {
            if (this.soldeirs == r2.soldeirs) {
                return this.idx - r2.idx; 
            } else {
                return this.soldeirs - r2.soldeirs;
            }
        }
    }
    public static void main(String[] args) {
        int k = 2;
        int rows[][] = {{1, 0, 0, 0},
                        {1, 1, 1, 1},
                        {1, 0, 0, 0},
                        {1, 0, 0, 0}};
        PriorityQueue<Row> rw = new PriorityQueue<>();
        for (int i = 0; i < rows.length; i++) {
            int sd = 0;
            for (int j = 0; j < rows[0].length; j++) {
                sd += rows[i][j] == 1 ? 1 : 0;
            }
            rw.add(new Row(sd, i));
        }
       for (int j = 0; j < k; j++) {
        System.out.println("R" + rw.remove().idx);
       }
    }
}
