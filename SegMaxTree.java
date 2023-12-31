public class SegMaxTree {
    static int maxTree[];
    public static void init(int n){
        maxTree = new int[n * 4];
    }
    public static void segTree(int arr[], int ti, int i, int j){
        if(i == j){
            maxTree[ti] = arr[i];
            return;
        }
        int mid = (i + j) / 2;
        segTree(arr, 2 * ti + 1, i, mid);
        segTree(arr, 2 * ti + 2, mid + 1, j);
        maxTree[ti] = Math.max(maxTree[2 * ti + 1], maxTree[2 * ti + 2]);
    }
    public static int getMaxUtil(int idx, int si, int sj, int qi, int qj){
        if (qi > sj || qj < si) {
            return Integer.MIN_VALUE;
        } else if (si >= qi && sj <= qj) {
            return maxTree[idx];
        } else {
            int mid = (si + sj) / 2;
            int left = getMaxUtil(2 * idx + 1, si, mid, qi, qj);
            int right = getMaxUtil(2 * idx + 2, mid + 1, sj, qi, qj);
            return Math.max(left, right);
        }
    }
    public static int getMax(int arr[], int i, int j){
        int n = arr.length;
        return getMaxUtil(0, 0, n - 1, i, j);
    }
    public static int updateUtil(int idx, int si, int sj, int i, int newVal){
        if (i > sj || i < si) {
            return maxTree[idx];
        }else if(si == sj) {
            if (i == si) {
                maxTree[idx] = newVal;
            }
            return maxTree[idx];
        } else {
            int mid = (si + sj) / 2;
            int left = updateUtil(2 * idx + 1, si, mid, i, newVal);
            int right = updateUtil(2 * idx + 2, mid + 1, sj, i, newVal);
            return  maxTree [idx] = Math.max(left, right);     
        }
    }
    public static void update(int arr[], int i, int newVal){
        arr[i] = newVal;
        int n = arr.length;
        updateUtil(0, 0, n - 1, i, newVal);
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 6, 9, 7, 8, 3, 4};
        init(arr.length);
        segTree(arr, 0, 0, arr.length - 1);
        for (int i = 0; i < maxTree.length; i++) {
            System.out.print(" " + maxTree[i]);
        }
        System.out.println(" > " + getMax(arr, 1, 4));
        update(arr, 4, 12);
        for (int i = 0; i < maxTree.length; i++) {
            System.out.print(" " + maxTree[i]);
        }
    }
}
