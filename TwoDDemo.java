import java.util.*;
class TwoDDemo
{
    public static void main(String arg[])
    {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the row of matrics :");
int rows=sc.nextInt();
System.out.print("Enter the column of matrics :");
int cols=sc.nextInt();
System.out.println("Enter the element of array :");
int [][] marks=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                marks[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrices are :");
        for(int i=0;i<rows;i++)
    {
    for(int j=0;j<cols;j++)
    {
        System.out.print(marks[i][j]+"\t");
    }
    System.out.println();
}

    }    
}