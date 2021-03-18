import java.util.Enumeration;
import java.util.Iterator;

public class Vector {
    public static void main(String[] args) {

        //vector is synchronized
        java.util.Vector<Integer> v=new java.util.Vector<Integer>();
        v.add(10);
        v.add(20);
        v.add(30);
        //using iterator or enumeration
        Enumeration e=v.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        //searching element is faster than arrayList
        //search element after 1st index
        System.out.println(v.indexOf(30,1));
    }
}
