import java.util.Queue;
import java.util.LinkedList;
public class GraphPracticeQset1Q3 {
    static class Ele {
        int x = 0, y = 0;
        public Ele(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static boolean checkAll(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isValid(int x, int y, int m, int n) {
        return (x >= 0 && y >= 0 && x < m && y < n);
    }

    public static boolean isDelim(Ele temp) {
        return (temp.x == -1 && temp.y == -1);
    }

    public static int time2Rot(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;
        int ans = 0;
        Queue<Ele> qu = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 2) {
                    qu.add(new Ele(i, j));
                }
            }
        }
        qu.add(new Ele(-1, -1));
        while (!qu.isEmpty()) {
            boolean flag = false;
            while (!isDelim(qu.peek())) {
                Ele temp = qu.peek();
                if (isValid(temp.x + 1, temp.y, m, n) && arr[temp.x + 1][temp.y] == 1) {
                    if (!flag) {
                        flag = true;
                        ans++;
                    }
                    arr[temp.x + 1][temp.y] = 2;
                    temp.x++;
                    qu.add(new Ele(temp.x, temp.y));
                    temp.x--;
                }
                if (isValid(temp.x - 1, temp.y, m, n) && arr[temp.x - 1][temp.y] == 1) {
                    if (!flag) {
                        flag = true;
                        ans++;
                    }
                    arr[temp.x - 1][temp.y] = 2;
                    temp.x--;
                    qu.add(new Ele(temp.x, temp.y));
                    temp.x++;
                }
                if (isValid(temp.x, temp.y + 1, m, n) && arr[temp.x][temp.y + 1] == 1) {
                    if (!flag) {
                        flag = true;
                        ans++;
                    }
                    arr[temp.x][temp.y + 1] = 2;
                    temp.y++;
                    qu.add(new Ele(temp.x, temp.y));
                    temp.y--;
                }
                if (isValid(temp.x, temp.y - 1, m, n) && arr[temp.x][temp.y - 1] == 1) {
                    if (!flag) {
                        flag = true;
                        ans++;
                    }
                    arr[temp.x][temp.y - 1] = 2;
                    temp.y--;
                    qu.add(new Ele(temp.x, temp.y));
                    temp.y++;
                }
                qu.remove();
            }
            qu.remove();
            if (!qu.isEmpty()) {
                qu.add(new Ele(-1, -1));
            }
        }
        return (checkAll(arr) ? -1 : ans);
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 1, 0, 1, 1},
                       {0, 1, 2, 1, 0},
                       {1, 0, 0, 1, 1}};
        int t = time2Rot(arr);
        if (t == -1) {
            System.out.println("Can't rott every Orange");
        } else {
            System.out.println("Time to rott all Oranges > " + t);
        }             
    }
}
