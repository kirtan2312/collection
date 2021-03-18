import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Vector;

public class IO_Ex {

    public static void main(String[] args) {
        char character=args[1].charAt(0);
        File file=new File(args[0]);
        try {
            FileReader file_reader=new FileReader("/home/kirtan/IdeaProjects/Test/src/"+file);
            BufferedReader bufferrd_reader=new BufferedReader(file_reader);
            String line="";
            int count=0;
            while((line=bufferrd_reader.readLine())!=null){
                String words[]=line.split(" ");

                for(int i=0;i<words.length;i++)
                {
                    count=count+isChar(words[i],character);
                }
            }
            System.out.println(count);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static int isChar(String word,char c)
    {
        int count=0;

        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==c)
            {
                count=count+1;
            }
        }
        return count;
    }
}
o/p:https://github.com/kirtan2312/collection/blob/kirtan/src/Snapshots/IO_Ex_1.png
