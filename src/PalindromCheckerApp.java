import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addLast(20);
        dq.addLast(30);

        System.out.println("Front element: " + dq.peekFirst());
        System.out.println("Rear element: " + dq.peekLast());
    }
}