import java.io.*;
import java.util.*;

class seta32
{
      public static void main(String[] args)
      {
             int[] a = new int[5];
             int i,j,temp;
             // accept array elements using cammamnd line
             for ( i=0;i<5;i++) 
                  a[i] = Integer.parseInt(args[i]);
             
             //int i,j,temp;
     
             for (i=0;i<5;i++)
                  for (j=0;j<5-1;j++){
                       if (a[j] > a[j+1]){
                           temp=a[j];
                           a[j]=a[j+1];
                           a[j+1]=temp;
                       }
                   }
            System.out.println(" \n Sorted Array elements are  : ");
            for ( i=0;i<5;i++) 
                 System.out.print(" \t "+a[i]+" \n ");
      }
}
