import java.io.*;
import java.util.*;

class seta4
{
      public static void main(String[] args)
      {
             String first_name,last_name,middle_name;
             Scanner sc = new Scanner(System.in);
             
             System.out.print(" Enter First name of person : ");
             first_name=sc.next();
             System.out.print(" Enter middle name of person : ");
             middle_name=sc.next();
             System.out.print(" Enter last name of person : ");
             last_name=sc.next();
             
             int len = middle_name.length();
             String f_l=middle_name.substring(0,1);
             String l_s=middle_name.substring(1,len);
             (f_l)=f_l.toUpperCase();
             middle_name=f_l+l_s;
             System.out.print("\n Updated string : \n");   
             System.out.println(" last name of person : "+last_name);
             System.out.println(" First name of person : "+first_name); 
             System.out.println(" middle name of person : "+middle_name);         
      }
}

