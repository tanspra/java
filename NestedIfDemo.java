import java.util.*;
class NestedIfDemo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the four No :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println("Biggest among of all is :"+a);
                }
            }
        }
        if(b>a){
            if(b>c){
                if(b>d){
                    System.out.println("Biggest among of all is :"+b);
                }
            }
        }
        if(c>b){
            if(c>a){
                if(c>d){
                    System.out.println("Biggest among of all is :"+c);
                }
            }
        }
        if(d>b){
            if(d>c){
                if(d>a){
                    System.out.println("Biggest among of all is :"+d);
                }
            }
        }
    }
}