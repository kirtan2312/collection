import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection_API {
    public static void main(String[] args) {
       try
       {

           Class c=Class.forName("Person");

           //creating object of Person class without new keyword
           Person o=(Person)c.newInstance();
           
           System.out.println(o instanceof Person);

           Field fileds[]=c.getDeclaredFields();
           System.out.println("******Fields of Person Class******");
           for(Field f: fileds)
           {
               System.out.println(f);
           }
           Method method[]=c.getDeclaredMethods();
           System.out.println("******Methods of Person Class******");
           for(Method m: method)
           {
               System.out.println(m);
           }
       }
       catch (Exception e)
       {
           System.out.println(e);
       }
    }
}
