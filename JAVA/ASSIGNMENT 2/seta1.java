
import java.io.*;
import java.util.*;

class seta1
{ 
      int id;
      String name,d_name;
      float sal;
      static int objcnt=0;
      emp ()
      {
          id=0;
          name=null;
          d_name=null;
          sal=0;
          objcnt++;
          
      }
      emp (int id,String name)
      {
          this.id=id;
          this.name=name;
          objcnt++;
          
      }
      emp (int id,String name,String d_name)
      {
          this.id=id;
          this.name=name;
          this.d_name=d_name;
          objcnt++;
          
      }
      emp (int id,String name,String d_name,float sal)
      {
          this.id=id;
          this.name=name;
          this.d_name=d_name;
          this.sal=sal;
          objcnt++;
          
      }
      public static void main(String[] args)
      {
             
             emp ob1 = new emp();
             emp ob2 = new emp(1,"siddhi");
             emp ob3 = new emp(1,"siddhi","CS");
             emp ob4 = new emp(1,"siddhi","CS",1000000);
             
             System.out.println(" id  : "+ob2.id);
             System.out.println(" name  : "+ob2.name);
             System.out.println(" d_name  : "+ob3.d_name);
             System.out.println(" sal  : "+ob4.sal);
             System.out.println(" Total number of object's are  : "+emp.objcnt);
             
      }
}
