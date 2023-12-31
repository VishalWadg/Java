public class QueueUsingArray {
    static class Queue {
        static int arr[];
        static int rear;
        static int size;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static boolean isFull() {
            return rear == size - 1;
        }

        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full !");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue !");
                return -1;
            }
            int fornt = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return fornt;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue !");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String args[]) {
        Queue qu = new Queue(5);
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        while (!qu.isEmpty()) {
            System.out.println(qu.remove());
        }
    }
}
