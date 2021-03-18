import java.util.*;

public class Agg_Func_Ex_1 {
    public static void main(String[] args) {

        List<Person> list=new ArrayList<Person>();
        Person person1=new Person();
        person1.setGender("Male");
        person1.setName("kirtan");
        list.add(person1);

        Person person2=new Person();
        person2.setGender("Male");
        person2.setName("b");
        list.add(person2);

        Person person3=new Person();
        person3.setGender("Female");
        person3.setName("a");
        list.add(person3);

        //get all persons which gender is Male
        list.stream().filter(person->person.getGender()=="Male").forEach(ele->System.out.println(ele));
    }
}


o/p:-https://github.com/kirtan2312/collection/blob/kirtan/src/Snapshots/Agg_Fun_Ex_1.png
