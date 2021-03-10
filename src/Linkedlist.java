import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class Linkedlist {

    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("a");
        ll.add("b");
        ll.add("c");
        ll.add("d");
        System.out.println(ll.contains("a"));

        //traverse the ll in descendiing order
        Iterator<String> it=ll.descendingIterator();
        while(it.hasNext())
        {
            String s=it.next();
            System.out.println(s);
        }

        //add arrayList in LinkedList
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("e");
        arr.add("f");
        arr.add("g");
        ll.addAll(arr);
        System.out.println(ll);




        //LinkedList as Queue (FIFO order)
        System.out.println(ll.poll());
        System.out.println(ll);
        System.out.println(ll.pop());
        System.out.println(ll);
        System.out.println(ll.peek());
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
        System.out.println(ll);

        LinkedList<String> list=new LinkedList<String>();
//        list.pop();//throwing Exception//if any element not found then it throws Exception
        System.out.println(list.poll());//it returns null if any element not found
        list.push("r");

        ll.pollFirst();
        ll.pollLast();
        System.out.println(ll);

        //to add elements in First
        ll.addFirst("j");
        ll.offerFirst("i");
        System.out.println(ll);

        ll.addAll(list);
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

        //cerate clone of LinkedList
        LinkedList l2=(LinkedList)ll.clone();
        System.out.println(l2);

        ll.add(2,"j");
        System.out.println(ll.lastIndexOf("j"));

    }
}
