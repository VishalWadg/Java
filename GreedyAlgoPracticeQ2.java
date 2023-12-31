public class GreedyAlgoPracticeQ2 {

    public static int kthOdd(int range [], int k) {
        if (k <= 0) {
            return 0;
        }
        int L = range[0];
        int R = range[1];
        if ((R & 1) > 0) {
            int count = (R - L + 1)/2;
            if ( Math.abs(L % 2) == 1) {
                if (k > count + 1) {
                    return 0; 
                } else {
                    return (R - 2 * k + 2);
                }
            }
            if (k > count) {
                return 0; 
            } else {
                return (R - 2 * k + 2);
            }
        } else {
            int count = (R - L + 1)/2;
            if (k > count) {
                return 0; 
            } else {
                return (R - 2 * k + 1);
            }
        }

    }
    public static void main (String args[]) {
        int Range[] = {-1, 3};
        int k = 3;
        System.out.println(k + "th largest odd number in the given range (" + Range[0] + ", " + Range[1] + ") is > " + kthOdd(Range, k));
        System.out.println(Math.ceil((3 + 3 + 1) / 2));
    }
}
