import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        //Treeset does not allow null element
        //not thread safe
        TreeSet t_set=new TreeSet();
        t_set.add(10);
//        t_set.add("a");
        t_set.add(20);
        t_set.add(30);
        Iterator it= t_set.iterator();
        //once you applied iterator you can not add values
//        t_set.add(50);//it gives concurentModification Exception
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
