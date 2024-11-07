import java.io.*;
 import java.lang.*;
 class Threadclassdemo extends Thread{
     public static void main(String args[])
     {
         Thread t1=new Thread("My Thread");
         Threadclassdemo t2=new Threadclassdemo();
         t1.start();
         String str=t1.getName();
         System.out.println("The name of Thread 1 is: "+str);
     }
     public void run()
     {
         System.out.println("The Thread is created and is executed");
     }
 }
