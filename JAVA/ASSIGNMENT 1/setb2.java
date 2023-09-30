import java.io.*;
import java.util.*;

class MyNumber
{
      private int data;
      MyNumber ()
     { 
        data=0;  
     }
     MyNumber (int data)
     { 
        this.data=data;  
     }
     int isNeg()
     {
         if (data < 0)
            return 1;
         else
             return 0;
     }
      int ispos()
     {
         if (data > 0)
            return 1;
         else
             return 0;
     }
      int isodd()
     {
         if (data %2 == 1)
            return 1;
         else
             return 0;
     }
      int iseven()
     {
         if (data %2 == 0)
            return 1;
         else
             return 0;
     }
}

class Check_num
{
      public static void main(String[] args)
      {
             int n;
             n=Integer.parseInt(args[0]);
             MyNumber ob = new MyNumber(n);
             int k1 = ob.isNeg();
             if (k1==1)
             System.out.println(n+ " is Negative ");
             int k2= ob.ispos();
             if (k2==1)
             System.out.println(n+ " is positive ");
             int k3 = ob.isodd();
             if (k3==1)
             System.out.println(n+ " is odd ");
             int k4 = ob.iseven();
             if (k4==1)
             System.out.println(n+ " is even ");
             
 }
 
 }
