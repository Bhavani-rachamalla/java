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

