import java.io.*;
import java.util.*;

class seta2
{ 
       int rno;
       String name;
       float per;
      stud_sort(int rno1,String name1,float per1)
      {
                rno=rno1;
                //System.out.println("\n Roll no. : "+rno);
                name=name1;
                per=per1;
                
      }
      float getper()
      {
            return per;
      }
      void display()
      {
           
            
               
                System.out.print(" "+rno+" \t  "+name+"\t  "+per+" \n");
            
      }
     public static void sort(int n,stud_sort s[])
      {
            for (int i=0;i<n;i++){
                  for (int j=i+1;j<n;j++){
                       if (s[j].getper() > s[i].getper()){
                          stud_sort temp=s[i];
                           s[i]=s[j];
                           s[j]=temp;
                       }
                   }
                }
            System.out.println("\n Roll no.  Name Percentage : ");
            for (int i=0;i<n;i++)
                 s[i].display();
      
      }
           
      public static void main (String[] args)
      {
             //stud_sort st = new stud_sort();
             Scanner sc = new Scanner(System.in);
             System.out.print("\n Enter number of Students : ");
             int n=sc.nextInt();
             stud_sort st[] = new stud_sort[n];
             for (int i=0;i<n;i++)
             {
                 
                 System.out.print("\n Enter roll no. of student : ");
                 int r=sc.nextInt();
                 System.out.print("\n Enter name of student : ");
                 String name_1=sc.next();
                 System.out.print("\n Enter percentage of student : ");
                 float per_1=sc.nextFloat();
                 st[i] = new stud_sort(r,name_1,per_1);
                 
           
             }
             stud_sort.sort(n,st);
             
             
      }
}
          
