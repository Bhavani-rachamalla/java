import java.io.*;
class Animal{
    String color="White";
    void eat()
    {
        System.out.println("Animal is eating");
    }
    Animal()
        {
             System.out.println("Animal  object is created");
        }
}
class Dog extends Animal
{
    String color="Black";
    Dog(){
        super();
         System.out.println("Dog  object is created");
    }
    void printcolor()
    {
        System.out.println("Dog color is: "+color);
        System.out.println("Animal coior is: "+super.color);
    }
}
class Superdemo3
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        d.printcolor();
    }
 }
