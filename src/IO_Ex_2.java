import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class IO_Ex_2 {
    public static void main(String[] args) {
        File file=new File(args[0]);
        try {
            FileReader file_reader=new FileReader("/home/kirtan/IdeaProjects/Test/src/"+file);
            BufferedReader bufferrd_reader=new BufferedReader(file_reader);
            String line="";
            int line_count=0;
            long num=0;
            while((line=bufferrd_reader.readLine())!=null){
                line_count++;
                if(line_count==1)
                {
                    num=Long.parseLong(line.trim());
                }
                String words[]=line.split(" ");
                for(int i=0;i<words.length;i++)
                {
                    if(findLong(words[i],num))
                    {
                        System.out.println("Line no : "+line_count);
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static boolean findLong(String word,long number)
    {
        long num=0;
        if(word==null || word=="")
        {
            return false;
        }
       try
       {
           num=Long.parseLong(word);
       }
       catch(NumberFormatException e)
       {
           return false;
       }
       return (num==number) ? true :false;
    }
}