import java.util.ArrayList;
public class Heaps {
    static class Heap {

        ArrayList<Integer> arr = new ArrayList<>();
        public void add (int data) {
            arr.add(data);
            int x = arr.size() - 1;
            int par = (x - 1) / 2;
            while (arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x = par;
                par = (x - 1) / 2;
            }
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIndex = i;
            if (left < arr.size() && arr.get(minIndex) > arr.get(left)) {
                minIndex = left;
            }

            if (right < arr.size() && arr.get(minIndex) > arr.get(right)) {
                minIndex = right;
            }

            if(minIndex != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, temp);
                heapify(minIndex);
            }
        }

        public int remove() {
            int data = arr.get(0);
            // Swap 
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);
            // remove
            arr.remove(arr.size() - 1);

            // Heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }

        public int peek () {
            return arr.get(0);
        }
    }
    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(4); 
        hp.add(1);
        hp.add(6);
        hp.add(7);
        hp.add(2);
        hp.add(5);
        hp.add(8);
        while (!hp.isEmpty()) {
            System.out.println(hp.remove());
        }
        System.out.println("> " + hp.isEmpty());
    }
}
