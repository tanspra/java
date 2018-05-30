class child extends Thread{
public void run(){
System.out.println("Child threads starts");
for(int i=0;i<=10;i++){
System.out.println(i);
try{
Thread.sleep(500);
}
catch(Exception e){
System.out.println(e);
}
}
}

}
public class TestThread{
public static void main(String[] args){
System.out.println("main thread starting");
child td=new child();
System.out.println("child thread starting");
td.start();
for(int i=0;i<=10;i++){
System.out.println(i);
try{
Thread.sleep(700);
}
catch(Exception e){
System.out.println(e);
}
}
System.out.println("Main thread is terminating");
}
}