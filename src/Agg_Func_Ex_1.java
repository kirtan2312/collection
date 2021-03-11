import java.util.*;

public class Agg_Func_Ex_1 {
    public static void main(String[] args) {

        List<Person> list=new ArrayList<Person>();
        Person p1=new Person();
        p1.setGender("Male");
        p1.setName("kirtan");
        list.add(p1);
       // System.out.println(p1);

        Person p2=new Person();
        p2.setGender("Female");
        p2.setName("a");
        list.add(p2);
       // System.out.println(p2);

        Person p3=new Person();
        p3.setGender("Male");
        p3.setName("b");
        list.add(p3);
        //System.out.println(p3);

        //get all persons which gender is Male
        list.stream().filter(p->p.getGender()=="Male").forEach(e->System.out.println(e));
    }
}
