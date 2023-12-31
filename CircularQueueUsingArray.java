public class CircularQueueUsingArray {
    static class CircQueue {
        static int arr[];
        static int rear;
        static int front;
        static int size;

        CircQueue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full !");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue !");
                return -1;
            }
            int temp = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return temp;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue !");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main (String args[]) {
        CircQueue qu = new CircQueue(3);
        qu.add(1);
        qu.add(2);
        qu.add(3);
        System.out.println(qu.remove());
        qu.add(4);
        System.out.println(qu.remove());
        qu.add(5);
        while (!qu.isEmpty()) {
            System.out.println(qu.remove());
        }
    }

}
