import java.util.*;
import java.io.*;

abstract class Staff
{
  protected int id;
  protected String name;
  Staff(int id,String name)
  {
    this.id=id;
    this.name=name;
  }
    abstract void displayDetails();
}
class OfficeStaff extends Staff
{
  private String dept;
  OfficeStaff(int id,String name,String dept)
  {
    super(id,name);
    this.dept=dept;
  }
     void displayDetails()
     {
      System.out.println("\n ID :" +id); 
      System.out.println("\n Name :" +name); 
      System.out.println("\n Department :" +dept);
     }
}
class Office
{
 public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("\nEnter number of Staff Members :");
 int n=sc.nextInt();
 OfficeStaff os[]=new OfficeStaff[n];
 for (int i=0;i<n;i++)
 {
    System.out.println("\n Enter ID :"); 
    int id =sc.nextInt();
    System.out.println("\n Enter Name :"); 
    String name =sc.next();
    System.out.println("\n Enter Dept:");
    String dept = sc.next();
     os[i]=new OfficeStaff(id,name,dept);
     }
      System.out.println("\nDetails of Staff Members :");
          for (int i=0;i<n;i++)
              os[i].displayDetails();
              }
              }
              
    
         
