import java.util.*;
class SumOfDigit
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no :");
    int no=sc.nextInt();
    int sumOfDigit=0;
     do
     {
         int m,n;
         n=no%10; //modulus
         no=no/10;//remainder
         sumOfDigit += n;
         if(no/10==0)
         {
             sumOfDigit +=no;
         }

     }
     while(no/10!=0);
     System.out.print("Sum of digit of given no is :"+sumOfDigit);
        

    }
}