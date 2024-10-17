mport java.io.*;
abstract class Bike
{
    void run()
    {
        //System.out.println("Bike is running");
    }
   // abstract void run();
}
class Honda extends Bike
{
    void run()
    {
        System.out.println("Honda is running");
    }
    public static void main(String args[])
    {
        Bike b=new Honda();
        b.run();
    }
}
