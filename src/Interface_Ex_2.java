import java.util.*;

public class Interface_Ex_2 {
    public static void main(String[] args) {
        Set set=new HashSet();

        set.add("kirtan");
        set.add("pacnhal");
        set.add("aca");
        set.add("kn");
        System.out.println(sortingSet(set));
    }

    public static Set sortingSet(Set set)
    {
        SortedSet<String> s=new TreeSet<String>(set);
        return s;
    }
}
