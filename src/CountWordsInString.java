import java.util.*;
import java.util.LinkedList;
import java.util.Map.Entry;

public class CountWordsInString {

    public static void main(String[] args) {
        String string="java is programming language and java is platform independent";
        String words[]=string.split(" ");
        Map<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<words.length;i++)
        {
            if(!map.containsKey(words[i]))
            {
                map.put(words[i],1);
            }
            else
            {
                map.replace(words[i],map.get(words[i])+1);
            }

        }
        Set<Entry<String,Integer>> set=map.entrySet();
        for(Entry<String,Integer> entry : set)
        {
            System.out.println(entry.getKey()+ ":" +entry.getValue());
        }




    }
}
