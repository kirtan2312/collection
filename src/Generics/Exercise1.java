package generics;

import java.util.Collection;
import java.util.function.*;

import java.util.*;

class OddElements implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return (integer % 2 !=0) ? true : false;
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(5);
        list.add(10);
        list.add(12);
        list.add(13);
        list.add(17);
        System.out.println("Total odd  numbers : "+countOddNumbers(list,new OddElements()));
    }
    public static <T> int countOddNumbers(Collection<T> collection, Predicate<T> predicate)
    {
        int counter = 0;
        for (T element : collection)
        {
            if(predicate.test(element))
            {
                counter++;
            }
        }
        return counter;
    }
}

https://github.com/kirtan2312/collection/blob/main/src/Snapshots/Generics_Excercise1.png
