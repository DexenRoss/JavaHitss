import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(40);
        queue.offer(10);
        queue.offer(30);
        queue.offer(20);
        
        while (!queue.isEmpty()) {
            System.out.println("Atendiendo -> "+queue.poll());
        }
        System.out.println(queue);
    }
}
