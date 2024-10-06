import java.io.*;
class A{
public static void main()
{
    void callMe()
    {
        System.out.println("Iam from A");
    }
  }
}
class B extends A
{
    void CallMe()
    {
        System.out.println("Iam from B");
    }
}
class Whoami
{
    public static void main(String args[])
    {
        A a1=new A();
        A a2=new B();
        B b=new B();
        a1.CallMe();
        a2.CallMe();
        b.CallMe();
    }
}
