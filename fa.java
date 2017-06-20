import java.io.*;
import java.util.*;
class fa
{
public static void main(String args[])
{
int a,b=1;
Scanner in=new Scanner(System.in);
System.out.println("Enter a number");
a=in.nextInt();
for(int i=1;i<=a;i++)
{
b=b*i;
}
System.out.println("Factorial = " + b);
}
}
