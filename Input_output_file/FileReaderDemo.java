import java.io.*;
class FileReaderDemo
{
    public static void main(String args[])throws Exception
    {
        FileReader fr=new FileReader("naresh.txt");
        int ch;
        while((ch=fr.read())!=-1)
        {
            System.out.print((char)ch);
            Thread.sleep(10);
        }
    }
}