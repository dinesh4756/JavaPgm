import java.io.*;
import java.util.*;
public class spg1
{
public static void main(String args[]) 
{
int n;
Scanner in = new Scanner(System.in);
System.out.print("Enter the number");
n=in.nextInt();
if(n>0)
System.out.println("Positive");
else if(n<0)
{
System.out.println("Negative");
}
else if(n=0)
{
System.out.println("Zero");
}
else
{
System.out.println("Input Invalid");
}
}
}
