import sy.*;
import ty.*;
import java.io.*;
import java.util.*;

public class stud
{ 
       int rno;
       int sytm,tytm,gt;
       String name;
      double per;
       stud(int rno1,String name1)
       {
            rno=rno1;
            name=name1;
       }
       
    
       
       public static void main (String[] args)
      {
             
             Scanner sc = new Scanner(System.in);
             System.out.print("\n Enter number of Students : ");
             int n=sc.nextInt();
                                                                                                                                                                  
             stud st[] = new stud[n];
             symarks sy[] = new symarks[n];
             tymarks ty[] = new tymarks[n];
             
             for (int i=0;i<n;i++)
             {
                 
                 System.out.print("\n Enter roll no. of student : ");
                 int r=sc.nextInt();
                 System.out.print("\n Enter name of student : ");
                 String name_1=sc.next();
                 System.out.print("\n Enter marks of sy computer total out of 200 : ");
                 int c=sc.nextInt();
                 System.out.print("\n Enter marks of sy math total out of 200 : ");
                 int m=sc.nextInt();
                  System.out.print("\n Enter marks of sy electronics total out of 200 : ");
                 int e=sc.nextInt();
                  System.out.print("\n Enter marks of ty theory out of 400 : ");
                 int th=sc.nextInt();
                  System.out.print("\n Enter marks of ty practical out of 200 : ");
                 int pr=sc.nextInt();
                 
                 st[i] = new stud(r,name_1);
                 sy[i] = new symarks(c,m,e);
                 ty[i] = new tymarks(th,pr);
                 
                 
            }
             
           System.out.println("\n Roll no\tName\tcomtotal\tMathtotl\tElctotal\tTheory\tPrc: ");  
            for (int i=0;i<n;i++)
                  System.out.println( st[i].rno+"\t\t"+st[i].name+"\t"+sy[i].ct+"\t\t"+sy[i].mt+"\t\t"+sy[i].et+"\t\t"+ty[i].tm+"\t"+ty[i].pm+"\t"); 
                  //calculate percentage
                   
             for (int i=0;i<n;i++)
             {
                  
                 st[i].sytm=sy[i].ct+sy[i].mt+sy[i].et;
                 st[i].tytm=ty[i].tm+ty[i].pm;
                 st[i].gt=st[i].sytm+st[i].tytm;
                 st[i].per=(st[i].gt*100)/1200;
                 System.out.print("\n percentage : "+st[i].per);
                 if (st[i].per >= 70)
                     System.out.print("\n Student  < " +st[i].name+ " > pass with A Grade\n");
                 else if (st[i].per >= 60)
                     System.out.print("\n Student  < " +st[i].name+ " > pass with B Grade\n");
                 else if (st[i].per >= 50)
                     System.out.print("\n Student  < " +st[i].name+ " > pass with C Grade\n");
                 else if (st[i].per >= 40)
                     System.out.print("\n Student  < " +st[i].name+ " > is pass\n");
                 else if (st[i].per < 40 )
                        System.out.print("\n Student  < " +st[i].name+ " > is FAIL..\n\n");
            }
                  
      }
     
}






