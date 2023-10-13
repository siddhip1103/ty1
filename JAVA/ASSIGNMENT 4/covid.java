import java.util.Scanner;
import java.util.*;


class covid
{
      int age,oxy,hrct;
      static int cnt=0;
      String name;
      
      covid()
      {
           this.age=0;
           this.name="";
           this.oxy=0;
           this.hrct=0;
      }
      covid (int a,String n,int o,int h)
      {
           this.age=a;
           this.name=n;
           this.oxy=o;
           this.hrct=h;
           cnt++;
      }  
      
    void display()
    {
         System.out.println("PATIENT COUNT : "+cnt);
         System.out.println("NAME : "+name);
         System.out.println("AGE : "+age);
         System.out.println("OXYGEN LEVEL : "+oxy);
         System.out.println("HRCT LEVEL : "+hrct);
        
    }


public static void main(String args[])
{
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter no. of patients : ");
       int n2=sc.nextInt();
       covid b[]=new covid[n2];
       int []a = new int[n2];
       int []o = new int[n2];
       int []h = new int[n2];
       String []n = new String[n2];
       for (int p=0;p<n2;p++)
       {
          System.out.print("enter patient name of "+(p+1)+"  : \n");
         n[p]=sc.next();
          
          System.out.print("enter Patient age of "+(p+1)+": \n");
          a[p]=sc.nextInt();
       
          System.out.print("enter O2 of "+(p+1)+" : \n");
          o[p]=sc.nextInt();
       
          System.out.print("enter HRCT  of "+(p+1)+": \n");
          	 h[p]=sc.nextInt();
          b[p]=new covid(a[p],n[p],o[p],h[p]);
          System.out.print("\nDetails of the Patient "+(p+1)+":\n");
          b[p].display();
       }
       System.out.println();
       for(int p=0;p<n2;p++)
          if(o[p]<95 && h[p]>10)
            try{
               throw new NullPointerException("\n");
            }
            catch (Exception e)
            {
                  System.out.println("Patient "+n[p]+" is covid Positive hospital la ja re....!!!!!!!");
            }
            
          else
          {
           System.out.println("Patient "+n[p]+" is covid Negative Nacha re.............!!!!!");
               b[p].display();
          }
}
}
    
 
