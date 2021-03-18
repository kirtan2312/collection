import java.util.*;

public class Interface_Ex_3 {

    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("  a ");
        list.add("b  ");
        list.add(" Kirtan Panchal  ");
        trimElements(list);

    }
    public static void trimElements(List<String> list)
    {
        List<String> new_list=new ArrayList<String>();
        for(String string:list)
        {
            new_list.add(string.trim());
        }
        System.out.println(list);
        System.out.println(new_list);
    }
}

o/p:-https://github.com/kirtan2312/collection/blob/kirtan/src/Snapshots/Interface_Ex_3.png
