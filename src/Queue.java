import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<Integer> queue=new PriorityQueue<Integer>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        queueueue.add(40);
//        queue.add(50);
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue);
//        System.out.println(queue.peek());
//        System.out.println(queue.element());//gives exception if any element not found
//        System.out.println(queue.peek());//returns null if any elements not found
//        System.out.println(queue.offer(60));
//        System.out.println(queue.add(60));
//        System.out.println(queue);

        Deque<Integer> deque=new ArrayDeque<Integer>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque);
        Iterator<Integer> it=deque.descendingIterator();
        deque.add(60);
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(deque);
    }
}
