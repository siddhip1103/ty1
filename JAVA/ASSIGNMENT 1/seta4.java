import java.io.*;
import java.util.*;

class Array_Rev
{
      public static void main(String[] args)
      {
             int n,i;
             Scanner sc = new Scanner(System.in);
             
             System.out.print("\n Enter size of array :");
             n=sc.nextInt();
             int[] a = new int[n];
             //accept array element
             System.out.print("\n Enter array elements : ");
             for ( i=0;i<n;i++)
                  a[i]=sc.nextInt();
             //Display array elements
             System.out.print("\n Entered array elements are : ");
             for ( i=0;i<n;i++)
                  System.out.print("\t"+a[i]+" ");
             //Reverse
             System.out.print("\n\nEnter array elements are : ");
             for ( i=n-1;i>=0;i--)
                  System.out.print("\t"+a[i]+" ");
             System.out.print("\n");
             
      }
}
