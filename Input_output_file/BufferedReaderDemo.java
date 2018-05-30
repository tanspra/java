import java.io.*;
class BufferedReaderDemo
{
    public static void main(String args[])throws Exception
    {
        System.out.print("Enter name :");
        InputStreamReader isr=new InputStreamReader(System.in);
        int size=1;
        BufferedReader br=new BufferedReader(isr);
        String name=br.readLine();
        System.out.print("Enter any character :");
        char ch=(char)br.read();
        System.out.println("Welcome "+name);
        
        System.out.println(ch);
    }
    
}