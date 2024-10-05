import java.io.*;
import java.util.*;
class ArrayListDemo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>al=new ArrayList<Integer>();
        int sum=0;
        float avg=0;
        System.out.println("Enter elements into arraylist");
        while(sc.hasNextInt())
        {
            al.add(sc.nextInt());
        }
        for(int i=0;i<al.size();i++)
        {
            sum=sum+al.get(i);
        }
        avg=sum/al.size();
        System.out.println("Sum of elements is "+sum);
        System.out.println("Average of elements is "+avg);
    }
}
