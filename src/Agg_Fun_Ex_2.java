import java.util.*;
import java.util.stream.Collectors;

public class Agg_Fun_Ex_2 {
    public static void main(String[] args) {
        List<Album> list=new ArrayList<Album>();
        Album a1=new Album();
        a1.setName("c");
        a1.setRating(4);
        list.add(a1);

        Album a2=new Album();
        a2.setName("b");
        a2.setRating(3);
        list.add(a2);

        Album a3=new Album();
        a3.setName("a");
        a3.setRating(5);
        list.add(a3);


        Set<String> s=new TreeSet<String>();
        //get albums which has 4 and above ratings
        list.stream().filter(a->(a.getRating()>=4)).forEach(a->s.add(a.getName()));
        System.out.println(s);
    }
}


o/p:-https://github.com/kirtan2312/collection/blob/kirtan/src/Snapshots/Agg_Fun_Ex_2.png
