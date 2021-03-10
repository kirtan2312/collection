import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<Integer> q=new PriorityQueue<Integer>();
//        q.add(10);
//        q.add(20);
//        q.add(30);
//        q.add(40);
//        q.add(50);
//        System.out.println(q);
//        System.out.println(q.poll());
//        System.out.println(q);
//        System.out.println(q.peek());
//        System.out.println(q.element());//gives exception if any element not found
//        System.out.println(q.peek());//returns null if any elements not found
//        System.out.println(q.offer(60));
//        System.out.println(q.add(60));
//        System.out.println(q);

        Deque<Integer> dq=new ArrayDeque<Integer>();
        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);
        dq.add(50);
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq);
        Iterator<Integer> it=dq.descendingIterator();
        dq.add(60);
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(dq);
    }
}
