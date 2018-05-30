abstract class Experimental
{
    abstract void m1();
}
class AnnonymousInnerClassDemo
{
    public static void main(String args[])
    {
        Experimental e=new Experimental()
        {
            void m1()
            {
                System.out.println("Welcome to annonymous inner class");
            }
        };
        e.m1();

    }    
}