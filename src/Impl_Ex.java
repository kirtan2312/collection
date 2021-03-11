import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.Random;

public class Impl_Ex {
    public static void main(String[] args) {
        File file=new File(args[0]);
        int lines=Integer.parseInt(args[1]);
        try
        {
            FileReader fr=new FileReader("/home/kirtan/IdeaProjects/Test/src/"+file);
            BufferedReader br=new BufferedReader(fr);
            String line="";
            int total_lines=0;
            List<String> list=new ArrayList<String>();
            while((line=br.readLine())!=null)
            {
                total_lines+=1;
                list.add(line);
            }
            Random r=new Random();
            for(int i=0;i<lines;i++)
            {
                int line_no=r.nextInt(total_lines);
                System.out.println (list.get(line_no));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}