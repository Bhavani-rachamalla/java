import java.io.*;
class Bike
{
    void run()
        {
            System.out.println("Bike is running");
        }
}
class Honda extends Bike
{
    void run()
    {
        System.out.println("Honda is running");
    }
}
class DMDDemo
{
    public static void main(String args[])
    {
        Bike b1=new Bike();
        b1.run();
        Honda h=new Honda();
        h.run();
        Bike b2=new Honda();
        b2.run();
    }
}

