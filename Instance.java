class A{
    A getA(){
        A b=new A();
        return b;
    }
    void message(){
        System.out.println(this);
        System.out.println("Message is ----->Hello Dear");
    }
}
class Instance{
    public static void main(String[] args){
//new A().getA().message();
A b=new A();
System.out.println(b);
b.message();
    }
}