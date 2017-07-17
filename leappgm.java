import java.io.*;
import java.util.*;
public class leappgm {
         public static void main(String[] args) {
          int year;
Scanner in=new Scanner(System.in);
year=in.nextInt();
          if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                        System.out.println("Year " + year + " is a leap year");
                else
                        System.out.println("Year " + year + " is not a leap year");
        }
}
