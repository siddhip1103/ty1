import java.util.*;
import java.io.*;

interface Printcube
{
  public void print(int num1);
}
  public class cube
  {
    public static void main(String args[])
    {
      Printcube c = n -> System.out.println("\ncube is :"+n*n*n);
      c.print(19);
      }
 }  
 
