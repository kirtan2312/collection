
import java.util.*;
import java.util.Map.Entry;


public class Example {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        Set<Entry<String,Integer>> set=map.entrySet();
        for(Entry entry : set)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("Size = "+map.size());

        Map m=new HashMap();
        m.putAll(map);
        System.out.println(m);

        map.clear();//remove all mapping

        System.out.println(map.isEmpty());//to check map is empty or not

        Map new_map=new HashMap(m);
        System.out.println(new_map);

        System.out.println(m.containsKey("a"));

        System.out.println(m.get("a"));

        Set set2=m.keySet();
        for(Object o:set2)
        {
            System.out.println(o);
        }
    }
}
