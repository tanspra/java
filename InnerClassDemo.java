class OuterClass
{
    class InnerClass
    {
        int data=100;
        void showData()
        {
            System.out.println("Stored data is "+data);
        }

    }
    InnerClass ic=new InnerClass();
    
    void useClass()
    {
        
        ic.showData();
        
    }
    void MemInnClass()
    {
        class InnerClassDemo{
            float weight=12.98f;
            void showWeight()
            {
                System.out.println("Your weight is "+weight);
            }
        }
        InnerClassDemo icd=new InnerClassDemo();
        icd.showWeight();
    }
}
class InnerClassDemo
{
    public static void main(String args[])
    {
        OuterClass oc=new OuterClass();
        oc.useClass();
        oc.MemInnClass();
    }
} 
