import java.util.*;
import java.util.Map.Entry;

public class Hashmap
{

    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("kirtan",1);
        map.put("abc",2);
        map.put("c",3);

        Map map2=new HashMap(map);

        map.put("abc",9);
        map.put(1,"aa");


        //if not present then put
        map.putIfAbsent("kirtan",11);
        map.putIfAbsent("f",7);

        Set<Entry> set=map.entrySet();
        for(Entry entry :set)
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


        System.out.println("-----------------------");
        //to check key is present or not?
        System.out.println(map.containsKey("kirtan"));
        System.out.println(map.containsKey("d"));

        System.out.println("-----------------------");
        //remove all pairs
        System.out.println(map2.size());
        map2.clear();
        System.out.println(map2.size());

        System.out.println("-----------------------");
        //get only keys
        Set<Entry> keys=map.keySet();
        for(Object ob :keys)
        {
            System.out.println(ob);
        }

        System.out.println("-----------------------");
        //get only values
        Collection values=map.values();
        for(Object ob:values)
        {
            System.out.println(ob);
        }

        System.out.println("-----------------------");
        map.remove("kirtan");
        System.out.println(map.containsKey("kirtan"));

        System.out.println("-----------------------");
        map.remove("c",5);
        System.out.println(map.containsKey("c"));

        System.out.println("-----------------------");
        map.replace("c",123);

        Map sync_map= Collections.synchronizedMap(map);
    }
}
