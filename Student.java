class Student
{
    String name;
    int age;
    double height;
    int marks;
    void getData(String a,int b,double c,int d)
    {
        name=a;
        age=b;
        height=c;
        marks=d;
    }
    void showData()
    {
        System.out.println("Welcome "+name+" !");
                System.out.println("You are "+age+" years old");
                        System.out.println("Marks = "+marks);
                                System.out.println("Height = "+height+" feet ");



    }

    
}