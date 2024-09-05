
import java.io.*;
import java.util.*;
public class ThisDemo
{
    private int a;
    public void set_Number(int a)
    {
        this.a=a;
        System.out.println("a value is "+a);
    }
    public static void main(String[] args)
        {
            ThisDemo td=new ThisDemo();
            td.set_Number(60);
        }
    }

