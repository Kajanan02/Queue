public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Deque queue = new Deque(5);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(58);
        queue.display();
        System.out.println(queue.dequeue());;
        queue.display();

    }
}
