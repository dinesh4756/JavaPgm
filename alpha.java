import java.io.*;
import java.util.*;
class alpha
{
public static void main(String args[])
{
char ch;
Scanner in=new Scanner(System.in);
System.out.print("Enter a Character:");
ch=in.next().charAt(0);
if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
{
System.out.print("Alphabet");
}
else
{
System.out.print("Not an Alphabet");
}
}
}
