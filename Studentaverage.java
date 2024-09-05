import java.io.*;
import java.util.Scanner;
public class StudentAverage
{
public static void main(String args[])
{
int Sm1,Sm2,Sm3,Sm4,Sm5;
double avg;
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks of 5 subjects:");
Sm1=sc.nextInt();
Sm2=sc.nextInt();
Sm3=sc.nextInt();
Sm4=sc.nextInt();
Sm5=sc.nextInt();
avg=(Sm1+Sm2+Sm3+Sm4+Sm5)/5.0;
System.out.println("Average is"+avg);
}
}
