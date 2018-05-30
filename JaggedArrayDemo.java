import java.util.*;
class JaggedArrayDemo
{
    public static void main(String arg[])
    {
Scanner sc=new Scanner(System.in);
int marks[][]=new int[4][];
marks[0]=new int[2];
marks[1]=new int[4]; 
marks[2]=new int[3]; 
marks[3]=new int[1]; 
System.out.println("Enter the element of array :");
    for(int i=0;i<marks.length;i++)
    {
    for(int j=0;j<marks[i].length;j++)
        {
            marks[i][j]=sc.nextInt();
        }
    }   
    System.out.println("Element of array :");
    for(int i=0;i<marks.length;i++)
    {
    for(int j=0;j<marks[i].length;j++)
        {
            System.out.print(marks[i][j]+"\t");
        }
        System.out.println();
    }
}
}