
import java.io.*;
 import java.lang.*;
 class ThreadRunnabledemo implements Runnable{
     public void run()
     {
         System.out.println("Thread is created and is executed");
     }
     public static void main(String args[])
     {
         ThreadRunnabledemo ob=new ThreadRunnabledemo();
         Thread t=new Thread(ob);
         t.start();
     }
 }
