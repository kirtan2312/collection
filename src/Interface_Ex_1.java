import java.util.*;

public class Interface_Ex_1 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        arr.add("e");
        System.out.println(shuffleElements(arr));
    }
    public static List shuffleElements(ArrayList<String> arr)
    {
        Collections.shuffle(arr);
        return arr;
    }
}

o/p:-https://github.com/kirtan2312/collection/blob/kirtan/src/Snapshots/Interface_Ex_1.png
