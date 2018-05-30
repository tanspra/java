import java.io.*;
class Student implements Serializable
{
    int sId;
    String sName;
    Student(String name,int id)
    {
        sId=id;
        sName=name;
    }
    public void  displayInfo()
    {
        System.out.println("SID= "+sId);
        System.out.println("SNAME= "+sName);
    }  
}
class SerializableDemo
{
    public static void main(String args[])throws Exception
    {
        Student s1=new Student("naresh",32);
        FileOutputStream fos=new FileOutputStream("nit.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s1);
        s1.displayInfo();
        oos.close();
    }
    
}