import java.util.ArrayList;
import java.util.List;

public class Agg_Fun_Ex_2 {
    public static void main(String[] args) {
        List<Album> list=new ArrayList<Album>();
        Album a1=new Album();
        a1.setName("a");
        a1.setRating(4);
        list.add(a1);

        Album a2=new Album();
        a2.setName("b");
        a2.setRating(3);
        list.add(a2);

        Album a3=new Album();
        a3.setName("c");
        a3.setRating(5);
        list.add(a3);

        //get albums which has 4 and above ratings
        list.stream().filter(a->(a.getRating()>=4)).forEach(a->System.out.println(a.getName()));

    }
}
