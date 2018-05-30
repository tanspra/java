import java.net.*;
import java.io.*;
class Client
{
    public static void main(String args[])throws Exception
    {
    Socket s=new Socket("localhost",200);
    //Stream for reading data from keyboard
    BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
    OutputStream out=s.getOutputStream();
    PrintStream ps=new PrintStream(out);
    //stream for reading data from server
    InputStream in=s.getInputStream();
    BufferedReader br=new BufferedReader(new InputStreamReader(in));
    String str,msg;
    while(!(str=kb.readLine()).equals("bye"))
    {
        ps.print(str);
        msg=br.readLine();
        System.out.println(msg);
   }
    // ps.close();
    // kb.close();
    // br.close();
    }
}