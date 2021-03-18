import java.util.*;
public class Arraylist

{
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>(20);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println(arr.size());
        System.out.println(arr.get(3));
        System.out.println("-----------------------");

        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }

        System.out.println("-----------------------");
        arr.set(2,1000);
        System.out.println(arr.get(2));

        System.out.println("-----------------------");
        arr.add(10);
//        arr.add(null);
        System.out.println(arr);
        arr.remove(4);
        System.out.println(arr);
        System.out.println(arr.get(4));
        System.out.println(arr.lastIndexOf(10));
        System.out.println(arr.subList(2,5));

//        arr.clear();
//        System.out.println(arr);

        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arr.removeAll(arrayList);
        System.out.println(arr);


        //decrease the size(current arrayList size)
        arr.trimToSize();
        System.out.println(arr.isEmpty());

        //convert to an array
        Object[] array=arr.toArray();
        for(Object ob : array)
        {
            System.out.println(ob);
        }


        arr.addAll(2,arrayList);
        System.out.println(arr);
    }

}
