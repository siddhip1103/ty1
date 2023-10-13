import java.util.*;
import java.io.*;

class text
{
      public static void main(String args[]) throws IOException
      {
             FileReader file = new FileReader("ok.txt");
             Scanner sc = new Scanner(file);
             String c2,c;
             while (sc.hasNext())
             {
                   StringBuilder c1 = new StringBuilder();
                   c = sc.nextLine();
                   System.out.println("Original Sring :"+c);
                   c2=c.toUpperCase();
                   c1.append(c2);
                   c1.reverse();
                   System.out.println("Reverse Sring :"+c1);
             }
             file.close();
             
      }
      
}

