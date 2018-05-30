class Fund{
    private int share,due;
    private static int amount;

    public Fund(int x){
        share=x;
        due=0;
        amount+=x;
    }

    public void withdraw(int amt){
      if(amt<=amount){
        due+=amt;
        amount-=amt;
        System.out.println("Withdrawl Successful Thank You!!!");
      }else{
        System.out.println("Not Enough Balance ('__')");
      }
       

    }
    public void deposite(int amt){
        due-=amt;
        amount+=amt;
        System.out.println("You have successfully deposited Rs "+amt);
        
    }
    public void getDetail(){
        System.out.println("Contribution is "+share);
        System.out.println("Due amount is "+due);
        
    }
    public static int getAmount()
    {
        return amount;
    }


}
class FundTest{
    public static void main(String[] args) {
Fund a=new Fund(2000);
 Fund b=new Fund(1500);
 System.out.println("Initial fund is "+Fund.getAmount());
 System.out.println("Details of member a :");
 a.getDetail();
 System.out.println("Details of member b :");
 b.getDetail();
 a.withdraw(500);
 b.withdraw(600);
 System.out.println("After Withdrawl");
 System.out.println("After First Withdrawl fund is "+Fund.getAmount());
 System.out.println("Details of member a :");
 a.getDetail();
 System.out.println("Details of member b :");
 b.getDetail();
 a.deposite(300);
 b.deposite(500);
 System.out.println("After Deposit");
 System.out.println("After First Deposite fund is "+Fund.getAmount());
 System.out.println("Details of member a :");
 a.getDetail();
 System.out.println("Details of member b :");
 b.getDetail();
    }

}