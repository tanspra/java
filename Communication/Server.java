import java.net.*;
import java.io.*;
class Server
{
    public static void main(String args[])throws Exception
    {
     ServerSocket ss=new ServerSocket(200);
    
    //creating socket to get request from client and data
    Socket s=ss.accept();
    System.out.println("Connection ok");//connection established
    //getting data from client
    InputStream is=s.getInputStream();
    BufferedReader br=new BufferedReader(is);
    //getting data from keyboard
    BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
    //sending data to client
    OutputStream out=s.getOutputStream();
    PrintStream ps=new PrintStream(out);
    while(true){
    String str,msg;
    while((str=br.readLine())!="null")
    {
        System.out.println(str);
        msg=kb.readLine();
        ps.println(msg);
    }
    // br.close();
    // kb.close();
    // ps.close();
    
}
}
}