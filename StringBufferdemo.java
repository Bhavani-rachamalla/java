import java.io.*;
 import java.lang.*;
 class StringBufferdemo
 {
     public static void main(String args[])
     {
         StringBuffer sb1=new StringBuffer("Hello");
         sb1.append("Java");
         System.out.println("The String is "+sb1);
         StringBuffer sb2=new StringBuffer("Hello");
         sb2.insert(2,"Java");
         System.out.println("The string is "+sb2);
         StringBuffer sb3=new StringBuffer("Hello");
         sb3.replace(1,3,"Java");
         System.out.println("The String is "+sb3);
         StringBuffer sb4=new StringBuffer("Hello");
         sb4.delete(1,3);
         System.out.println("The string is "+sb4);
         StringBuffer sb5=new StringBuffer("Hello");
         sb5.reverse();
         System.out.println("The String is "+sb5);
     }
}

         
