interface Collectable{
abstract void add(String obj);
abstract void remove(int index);

}


class Inter1 implements Collectable{
public void add(String a)
{
System.out.println("This is override method");
System.out.println(a);


}

public void remove(int x){
System.out.println(x);
}


public static void main(String args[]){
System.out.println("This is main bock");
String a="This is a message passed through an interface";
int x=90;
Inter1 all=new Inter1();


all.add(a);
all.remove(x);


}


}

