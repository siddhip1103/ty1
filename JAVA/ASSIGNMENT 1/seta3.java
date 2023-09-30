
import java.io.*;
import java.util.*;

class Switch_case
{
      public static void main(String[] args)
      {
             int length,breadth;
             Scanner sc = new Scanner(System.in);
             
             int r,h,fact=1,op=1,num;
             float PI = 3.14f;
             
             while (op >= 1 && op <= 4)
             {
                   System.out.println("\n 1:Volume of Cylinder...");
                   System.out.println(" 2:Factorial of number...");
                   System.out.println(" 3:Armstrong or not ...");
                   System.out.println(" 4:Exit...");
                   System.out.print("\n Enter Option : ");
                   op=sc.nextInt();
                   
                   switch (op)
                   {
                           case 1 : 
                                  System.out.print(" \nEnter radius of volume :");
                                  r=sc.nextInt();
                                  System.out.print("\n Enter height of volume : ");
                                  h=sc.nextInt();
                                  System.out.print("\n volume of Cylinder is : "+PI*r*r*h);
                                  System.out.print("\n");
                                  break;
                           case 2 :
                                  System.out.print("\n Enter number to find factorial  :");
                                  num=sc.nextInt();
                                  for (int i=1;i<=num;i++)
                                       fact=fact*i;
                                  System.out.print("\n Factorial Number is : "+fact); 
                                  System.out.print("\n");
                                  break;
                           case 3 : 
                                  System.out.print("\n Enter number to check whether it is Armstriong or not  :");
                                  num=sc.nextInt();
                                  int rem,num1,res=0;
                                  num1=num;
                                  while (num1 != 0)
                                  {
                                        rem = num1 % 10;
                                        res=res+ (rem*rem*rem);
                                        num1=num1/10;
                                  }
                                  if (res == num )
                                     System.out.print("\n"+num+"  is Armstrong number  :");
                                  else
                                       System.out.print("\n"  +num+  "  is not Armstrong number  :");
                                   System.out.print("\n");
                                  break;
                           case 4 :
                                   System.exit(0);
                                   break;
                           default :
                                     System.out.print("\n Enter Valid Option....... : ");
                                     break; 
                                  
                                  
                   }
             
             }
      }
}
