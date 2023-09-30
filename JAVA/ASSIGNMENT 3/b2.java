import java.util.Scanner;
import java.util.*;

interface products{
}

class b2 implements products
{
      int id,c,q;
      String name;
      
      b2()
      {
           this.id=0;
           this.name="";
           this.c=0;
           this.q=0;
      }
      b2 (int i,String n,int cost,int qn)
      {
           this.id=i;
           this.name=n;
           this.c=cost;
           this.q=qn;
          // cnt++;
      }  
      
    void display()
    {
         System.out.println("ID : "+id);
         System.out.println("NAME : "+name);
         System.out.println("COST : "+c);
         System.out.println("QUANTITY : "+q);
        // System.out.println("OBJECT COUNT : "+cnt);
    }


public static void main(String args[])
{
       /*setA1 e1 =new setA1();
       e1.display();*/
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter no. of products : ");
       int n2=sc.nextInt();
       b2 b[]=new b2[n2];
       
       for (int j=0;j<n2;j++)
       {
          System.out.print("enter id : ");
          int i=sc.nextInt();
       
          System.out.print("enter Product name : ");
          String n=sc.next();
       
          System.out.print("enter cost : ");
          int cost=sc.nextInt();
       
          System.out.print("enter Quantity : ");
          int qn=sc.nextInt();
          b[j]=new b2(i,n,cost,qn);
          b[j].display();
       }
       System.out.println();
}
}
      
