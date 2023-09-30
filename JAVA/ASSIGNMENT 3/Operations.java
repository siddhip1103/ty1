import java.util.*;
import java.io.*;

interface Operation
{
   float PI=3.14f;
   void area();
   void volume();
}
class cylinder implements Operation
{
  float r,h;
  void input()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter Radius of cylinder :");
    r=sc.nextFloat();
    System.out.println("\nEnter height of cylinder :");
    h= sc.nextFloat();
   }
     public void area()
     {
      float a=2*PI*r*(r+h);
      System.out.println("\nArea of cylinder :"+a);
     }
      public void volume()
       {
        float v=(PI*r*r*h);
        System.out.println("\nVolume of cylinder :"+v);
       }
}
class Operations
{
 public static void main(String args[])
 {
   cylinder c=new cylinder();
   c.input();
   c.area();
   c.volume();
 }
}
           
   
