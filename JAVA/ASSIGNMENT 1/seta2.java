import java.io.*;
import java.util.*;
public class seta2
{
  public static void main(String args[])
    {
       int l,b,peri,area;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter lenght:");
       l=sc.nextInt();
       System.out.println("enter breadth:");
       b=sc.nextInt();
       area=l*b;
       peri=2*(l+b);
       System.out.println("area:"+ area);
       System.out.println("perimeter:"+peri);
       }
      }
