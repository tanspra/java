class Factorial{
  public static void show(){
    int num=5,fact=1,num1=5,num2=5,fact1=1,fact2=1;
   while(num>1)
    {
        fact*=num;
        num--;
    }    
    System.out.println("factorial is "+fact);
    do {
        fact*=num;
        num--;
    }while(num>1);
  }
public static void main(String[] args){
    Factorial a=new Factorial();
show();





}
}