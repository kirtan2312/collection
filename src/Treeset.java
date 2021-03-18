import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        //Treeset does not allow null element
        //not thread safe
        TreeSet tree_set=new TreeSet();
        tree_set.add(10);
//        tree_set.add("a");
        tree_set.add(20);
        tree_set.add(30);
        Iterator it= tree_set.iterator();
        //once you applied iterator you can not add values
//        tree_set.add(50);//it gives concurentModification Exception
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
