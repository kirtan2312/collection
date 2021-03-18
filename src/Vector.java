import java.util.Enumeration;
import java.util.Iterator;

public class Vector {
    public static void main(String[] args) {

        //vector is synchronized
        java.util.Vector<Integer> vector=new java.util.Vector<Integer>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        //using iterator or enumeration
        Enumeration e=vector.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        //searching element is faster than arrayList
        //search element after 1st index
        System.out.println(vector.indexOf(30,1));
    }
}
