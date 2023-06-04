public class Deque {

    private static int front;
    private static int rear;
    private static int[] arr = {};

    public  Deque(int s) {
        rear = front = -1;
        arr = new int[s];
    }

    void enqueue(int v) {
        if (!isfull()) {
            if ((front == -1) && (rear == -1)) {
                front = rear = 0;

            } else {
                rear++;
            }
            arr[rear] = v;
        } else {
            System.out.println("over flow");
        }
    }

    int dequeue() {
        if (!isempty()) {
            front++;
            return arr[front - 1];
        } else {
            System.out.println("under flow");
            return -1;
        }

    }

    boolean isfull() {
        return (rear >= arr.length - 1);
    }

    boolean isempty() {
        return (((rear == -1) && (front == -1)) || (rear < front));
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("");
    }

    int front() {
        return arr[front];
    }
}
