
import java.io.*;
class Point2D
{
    int x,y;
    void display()
    {
        System.out.println("The coordinates are "+ x +","+ y);
    }
}
class Point3D extends Point2D
{
    int z=3;
    void display()
    {
        System.out.println("The coordinates are "+ x + y + z);
    }
public static void main(String args[])
{
    Point2D ob1=new Point2D();
    Point3D ob2=new Point3D();
    Point2D ob3=new Point3D();
    ob1.display();
    ob2.display();
    ob3.display();
}
}
