import java.util.*;

public class Interface_Ex_4 {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<Employee>();
        Employee employee1=new Employee();
        employee1.setId(1);
        employee1.setFn("a");
        employee1.setLn("aaa");
        list.add(employee1);

        Employee employee2=new Employee();
        employee2.setId(2);
        employee2.setFn("kirtan");
        employee2.setLn("panchal");
        list.add(employee2);

        Employee employee3=new Employee();
        employee3.setId(3);
        employee3.setFn("b");
        employee3.setLn("bb");
        list.add(employee3);

        Employee employee=chooseRandomEmp(list);
        System.out.println(employee.getFn());

    }

    public static Employee chooseRandomEmp(List<Employee> list)
    {
        Random r=new Random();
        Employee employee=list.get(r.nextInt(list.size()));
        return employee;
    }
}


o/p:-https://github.com/kirtan2312/collection/blob/kirtan/src/Snapshots/Interface_Ex_4.png
