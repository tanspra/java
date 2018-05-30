import java.util.*;
import java.lang.reflect.*;

class ReflectionDemo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("This program will give declared function interfaces and constructor in given class");
        System.out.println();
        System.out.print("Enter the name of class :");
        String className=sc.next();
        try{
            Class c=Class.forName(className);
            System.out.println("Superclass of "+className+" is :"+c.getSuperclass());
            
            Class i[]=c.getInterfaces();
            if(i.length==0)
            {
                System.out.println("No interface is implemented on this class");

            }else{
                System.out.println("Interfaces implemented on "+className+" are :");
                for(int j=0;j<i.length;j++)
                {
                    System.out.print("\t\t\t\t");
                    System.out.println(i[j].getName());
                }
            }
            Method[] m=c.getDeclaredMethods();
                 if(m.length==0)
                 {
                        System.out.println("No method is defined in this class");
                 }else{
                     System.out.println("Methods defined in "+className+" are :");
                     for(int j=0;j<m.length;j++)
                     {
                         String methodName=m[j].getName();
                         String returnType=m[j].getReturnType().getName();
                         Class parameterList[]=m[j].getParameterTypes();
                         Class exceptionList[]=m[j].getExceptionTypes();
                         int modifierList=m[j].getModifiers();
                         if(Modifier.isPublic(modifierList))
                         System.out.print("\tpublic");
                         if(Modifier.isPrivate(modifierList))
                         System.out.print("\tprivate");
                         if(Modifier.isProtected(modifierList))
                         System.out.print("\tprotected");
                         if(Modifier.isStatic(modifierList))
                         System.out.print("\tstatic");
                         if(Modifier.isFinal(modifierList))
                         System.out.print("\tfinal");
                         if(Modifier.isAbstract(modifierList))
                         System.out.print("\tabstract");
                         if(Modifier.isNative(modifierList))
                         System.out.print("\tnative");
                         if(Modifier.isSynchronized(modifierList))
                         System.out.print("\tsynchronized");
                         System.out.print(returnType+" "+methodName+"(");
                         for(int k=0;k<parameterList.length;k++)
                         {
                             System.out.print(parameterList[k].getName()+" ");
                             if(k==parameterList.length-1)
                             System.out.print(",");
                         }
                         System.out.print(")");
                         }
                    }
        }catch(Exception e)
        {
            System.out.println("Given class is not found in given folder. Please give complete reference. ");
        }
    }
}

