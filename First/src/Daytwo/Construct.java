package Daytwo;


class A
{
     public A(int x)
     {
         System.out.println("A"+x);
     }
}
class B extends A
{
    B(int x)
    {
        super(20);
        System.out.println("B"+x);
    }
}
class C extends B
{
    C()
    {
    super(10);
    System.out.println("C");   
    }
}
public class Construct {
public static void main(String[] args) {
        C c=new C();
}
}