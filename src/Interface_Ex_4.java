import java.util.*;

public class Interface_Ex_4 {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<Employee>();
        Employee e=new Employee();
        e.setId(1);
        e.setFn("a");
        e.setLn("aaa");
        list.add(e);

        Employee e2=new Employee();
        e2.setId(2);
        e2.setFn("kirtan");
        e2.setLn("panchal");
        list.add(e2);

        Employee e3=new Employee();
        e3.setId(3);
        e3.setFn("b");
        e3.setLn("bb");
        list.add(e3);

        Employee employee=chooseRandomEmp(list);
        System.out.println(employee.getFn());

    }

    public static Employee chooseRandomEmp(List<Employee> list)
    {
        Random r=new Random();
        Employee emp=list.get(r.nextInt(list.size()));
        return emp;
    }
}

o/p:-https://github.com/kirtan2312/collection/blob/kirtan/src/Snapshots/Interface_Ex_4.png
