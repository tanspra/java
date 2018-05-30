import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {
public static void main(String args[]) throws IOException
{
    FileWriter fw=new FileWriter("FileWriter.txt");
    Scanner sc=new Scanner(System.in);
    System.out.println("Plese Enter your name :");
    char name;
    while((name=sc.next().charAt(0))!='&')
    {
        fw.write(name);
    }
}
}