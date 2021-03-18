import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Vector;

public class Exception_Ex_1 {
    public static void main(String[] args) {
        File file=new File(args[0]);
        Vector<Integer> vector=new Vector<Integer>();
        try {
            FileReader file_reader=new FileReader("/home/kirtan/IdeaProjects/Test/src/"+file);
            BufferedReader bufferrd_reader=new BufferedReader(file_reader);
            String line="";
            int num=0;
            while((line=bufferrd_reader.readLine())!=null){
               String words[]=line.split(" ");
               for(int i=0;i<words.length;i++)
               {
                   if(isInteger(words[i]))
                   {
                       vector.add(Integer.parseInt(words[i]));
                   }
               }
            }
            System.out.println(vector);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static boolean isInteger(String string)
    {
        if(string==null || string=="")
        {
            return false;
        }
        try{
            int num=Integer.parseInt(string);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;

    }
}
o/p:https://github.com/kirtan2312/collection/blob/kirtan/src/Snapshots/Exception_Ex_1.png
