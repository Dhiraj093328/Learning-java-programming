import java.io.*;

class BufferedWriterDemo
{
    public static void main(String args[])
    {
        try{
            Writer w = new FileWriter("output1.txt");
            BufferedWriter br = new BufferedWriter(w);
            String content = "I like to leave pune";
            br.write(content);
            br.close();

            System.out.println("write sucessfully");
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
