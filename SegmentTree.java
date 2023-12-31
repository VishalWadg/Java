public class SegmentTree {
    static int tree[];
    public static void init(int n){
        tree = new int[4 * n];
    }
    public static int segTree(int arr[], int ti, int i, int j){
        if (i == j) {
            tree[ti] = arr[i];
            return tree[ti];
        }
        int mid = (i + j)/2;
        int lft = segTree(arr, ti * 2 + 1, i, mid);
        int rgt = segTree(arr, ti * 2 + 2, mid + 1, j);
        tree[ti] = lft + rgt;
        return tree[ti];
    }
    public static int getSumUtil(int i,int si, int sj, int qi, int qj){
        if (sj< qi || si > qj ) {
            return 0;
        } else if (si >= qi && sj <= qj) {
            return tree[i];
        } else {
            int mid = (si + sj)/2;
            int left = getSumUtil(2 * i + 1, si, mid, qi, qj);
            int right = getSumUtil(2 * i + 2, mid + 1, sj, qi, qj);
            return left + right;
        }
    }
    public static int getSum(int arr[], int qi, int qj){
        int n = arr.length;
        return getSumUtil(0, 0, n - 1, qi, qj);
    }
    public static void updateUtil(int i, int si, int sj, int idx, int diff){
        if (idx < si || idx > sj) {
            return;
        }
        tree[i] += diff;
        if (si != sj) {
            int mid = (si + sj) / 2;
            updateUtil(2 * i + 1, si, mid, idx, diff);
            updateUtil(2 * i + 2, mid + 1, sj, idx, diff);
        }
    }
    public static void update(int arr[], int i, int newVal){
        int n = arr.length;
        int diff = newVal - arr[i];
        arr[i] = newVal;
        updateUtil(0, 0, n-1, i, diff);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        init(n);
        segTree(arr, 0, 0, n - 1);
        System.out.println("sum from 2 to 6 > " + getSum(arr, 2, 6));
        update(arr, 2, 2);
        System.out.println("sum from 2 to 6 > " + getSum(arr, 2, 6));
                
    }
}
