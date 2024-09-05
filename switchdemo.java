

---------- Forwarded message ---------
From: navyasruthi yerramsetti <navyasruthi.yerramsetti@sasi.ac.in>
Date: Tue, Sep 3, 2024 at 3:29 PM
Subject:
To: <saranya.putti@sasi.ac.in>



public class Addition1
{
public static void main(String args[])
{
int x=-5;
int y=10;
int z=a+b;
System.out.println("Sum of"+x+"and"+y+"is"+z);
}
}
import java.io.*;
public class Addition1
{
public static void main(String args[])
{
int x=-5;
int y=10;
int z=a+b;
System.out.println("Sum of"+x+"and"+y+"is"+z);
}


import java.io.*;
class Division
{
public static void main(String args[])
{
int a=87;
int b=10;
float c=a/b;
System.out.println("Division of"+a+"and"+b+"is"+c);
}
}           
 import java.io.*;
import java.util.*;
public class EvenOdd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num;
System.out.println("Enter an integer to check whether it is even or odd:");
num=sc.nextInt();
if(num%2==0)
{
System.out.println(num+"is even integer");
}
else
{
System.out.println(num+"is odd integer");
}
}
}

import java.io.*;
public class Foreachdemo
{
public static void main(String args[])
{  
   int arr[]={10,20,30,40,50};
   {
 System.out.println("Array elements are:");
 for(int i:arr)
 {
   System.out.println(i+"");
 }
      }
}
}
import java.io.*;
public class Formattedoutput1
{
public static void main(String args[])
{  
 String str = "sruthi";
System.out.printf("The string value is: %s\n",str);
int x=512;
System.out.printf("\nThe integer value is: %d\n",x);
double f=5.25412368;
System.out.printf("\nThe decimal value is: %lf\n",f);
System.out.printf("\nAfter formatting to specific width the value is: %.4lf\n",f);
System.out.printf("After formatting to right margin the valu is: %20.4lf\n",f);
}
}




class Test
{
    public static void main(String []args)
    {
        System.out.println("My First Java Program.");
    }
};                       


import java.io.*;
import java.util.Scanner;
public class Palindrome
{
public static void main(String args[]) {
int r,s=0,temp,x;
Scanner sc = new Scanner(System.in);
System.out.println("Enter an integer to check is palindrome or not");
x=sc.nextInt();
temp=x;
while(x>0){
r=x%10;
s=(s*10)+r;
x=x/10;
}
if(temp==s)
{
System.out.println(temp+ " is a palindrome");
}
else{
System.out.println(temp+ " is not a palindrome");
}
}
}

 import java.io.*;
class Staticblockdemo{
public static void main(String args[]){
    System.out.println("Inside the main ()");
}
static{
    System.out.println("Inside static block");
}
}
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


import java.io.*;
class Subtraction
{
public static void main(String args[])
{
int a=5;
int b=10;
int c=a-b;
System.out.println("Subtraction of"+a+"and"+b+"is"+c);
}
}


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




import java.io.*;
public class Dowhiledemo
{
public static void main(String args[])
{  
   int i=0;
   do
   {
System.out.println("Hello World");
i++;
   }
while(i<3);
}
}



import java.io.*;
class Fordemo
{
    public static void main (String args[])
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("Hello World");
        }
    }
}


import java.io.*;
import java.util.Scanner;
public class Switchdemo
{
public static void main(String args[])
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number from 0to5:");
   int num = sc.nextInt();
   switch(num)
   {
       case 0:System.out.println("You enterted 0");
              break;
       case 1:System.out.println("You entered 1");
              break;
       case 2:System.out.println("You entered 2");
              break;
       case 3:System.out.println("You entered 3");
              break;
       case 4:System.out.println("You entered 4");
              break;
       case 5:System.out.println("You entered 5");
              break;
       default:System.out.println("You entered invalid number");
               break;
   }
   
}
}
                                 
