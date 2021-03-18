import java.util.*;
import java.util.stream.Collectors;

public class Agg_Fun_Ex_2 {
    public static void main(String[] args) {
        List<Album> list=new ArrayList<Album>();
        Album album1=new Album();
        album1.setName("c");
        album1.setRating(4);
        list.add(album1);

        Album album2=new Album();
        album2.setName("b");
        album2.setRating(3);
        list.add(album2);

        Album alnum3=new Album();
        alnum3.setName("a");
        alnum3.setRating(5);
        list.add(alnum3);

        Set<String> s=new TreeSet<String>();
        //get albums which has 4 and above ratings
        list.stream().filter(album->(album.getRating()>=4)).forEach(ele->s.add(ele.getName()));
        System.out.println(s);
    }
}



o/p:-https://github.com/kirtan2312/collection/blob/kirtan/src/Snapshots/Agg_Fun_Ex_2.png
