import java.io.*;
class FileInputStreamDemo
{
    public static void main(String args[])throws Exception
    {
        FileInputStream fis=new FileInputStream("Naresh.txt");
        int ch;
        while((ch=fis.read())!=-1)
    {
        System.out.print((char)ch);
        Thread.sleep(10);
    }
    }
}