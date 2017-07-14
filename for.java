import java.io.*;
import java.util.*;
class for
{
public static void main(String args[])
{
int n,sum=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter number");
n=in.nextInt();
for(int i=1;i<=n;i++)
{
sum=sum+i;
}
System.out.println("Sum=" + sum);
}
}
