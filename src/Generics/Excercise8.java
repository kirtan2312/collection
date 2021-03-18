package generics;

import java.util.List;

import java.util.*;
public class Excercise8 {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(40);
        list.add(30);
        list.add(20);

        System.out.println(maximum(list,0,list.size()));
    }
    public static <T extends Comparable> T maximum(List<T> list, int begin, int end) {

        T maxElement=list.get(begin);

        for(;begin<end;begin++)
        {

            if(maxElement.compareTo(list.get(begin)) < 0)
            {
                maxElement=list.get(begin);
            }
        }
        return maxElement;
    }
}
