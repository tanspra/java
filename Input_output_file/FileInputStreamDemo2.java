import java.io.*;
public class FileInputStreamDemo2 {
public static void main(String args[]) throws Exception
{
// FileInputStream fis=new FileInputStream("Data.txt");
 FileInputStream fis2=new FileInputStream("naresh.txt");
 int ch;
ch=fis2.read();
System.out.println(ch);
}    
}