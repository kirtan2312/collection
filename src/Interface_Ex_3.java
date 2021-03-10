import java.util.*;

public class Interface_Ex_3 {

    public static void main(String[] args) {
        List<String> ls=new ArrayList<String>();
        ls.add("  a ");
        ls.add("b  ");
        ls.add(" Kirtan Panchal  ");
        trimElements(ls);

    }
    public static void trimElements(List<String> list)
    {
        List<String> new_list=new ArrayList<String>();
        for(String s:list)
        {
            new_list.add(s.trim());
        }
        System.out.println(list);
        System.out.println(new_list);
    }
}
