class One{
    private int a,b;
    public One(int x,int y){
        a=x;
        b=y;
    }
    public void display(){
        System.out.println("Value of a is :"+a);
        System.out.println("Value of b is :"+b);
    }
}
class Two extends One{
    private int c;
    public Two(int x,int y,int z){
        super(x,y);
        c=z;
    }
    public void display(){
        super.display();
        System.out.println("value of c is :"+c);
    }
}
public class InheritanceTest{
    public static void main(String[] args){
        One a=new One(5,6);
        Two b=new Two(3,4,7);
        a.display();
        b.display();
    }

}