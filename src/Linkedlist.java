import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class Linkedlist {

    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        System.out.println(linkedList.contains("a"));

        //traverse the ll in descendiing order
        Iterator<String> it=linkedList.descendingIterator();
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
        linkedList.addAll(arr);
        System.out.println(linkedList);




        //LinkedList as Queue (FIFO order)
        System.out.println(linkedList.poll());
        System.out.println(linkedList);
        System.out.println(linkedList.pop());
        System.out.println(linkedList);
        System.out.println(linkedList.peek());
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList);

        LinkedList<String> list=new LinkedList<String>();
//        list.pop();//throwing Exception//if any element not found then it throws Exception
        System.out.println(list.poll());//it returns null if any element not found
        list.push("r");

        linkedList.pollFirst();
        linkedList.pollLast();
        System.out.println(linkedList);

        //to add elements in First
        linkedList.addFirst("j");
        linkedList.offerFirst("i");
        System.out.println(linkedList);

        linkedList.addAll(list);
        System.out.println(linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);

        //cerate clone of LinkedList
        LinkedList l2=(LinkedList)linkedList.clone();
        System.out.println(l2);

        linkedList.add(2,"j");
        System.out.println(linkedList.lastIndexOf("j"));

    }
}
