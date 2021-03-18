package generics;

import java.util.Arrays;

public class Excercise3 {
    public static void main(String[] args) {
        String array[]={"Kirtan","Panchal","1","2"};
        swapElements(array,1,2);
    }

    public static <T> void swapElements(T[] array,int index1,int index2)
    {
        T temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
        System.out.println(array[index1] +" : "+array[index2]);
    }
}

https://github.com/kirtan2312/collection/blob/main/src/Snapshots/Generics_Excercise3.png
