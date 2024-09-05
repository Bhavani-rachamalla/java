import java.io.*;
import java.text.DecimalFormat;
public class Formattedoutput2{
public static void main(String args[]){
    double x=123.45678;
    System.out.println("The number is:%lf\n"+x);
    DecimalFormat df=new DecimalFormat("#####");
    System.out.println("\nWithout fractional part the number is"+x);
    System.out.println("\nwithout fractional part the number is"+df.format(x));
     df=new DecimalFormat("#.##");
    System.out.println("\nFormatted number with precision is:"+df.format(x));
     df=new DecimalFormat("$####,###.##");
    System.out.println("\nAfter formatting the value is"+df.format(x));
}
}
