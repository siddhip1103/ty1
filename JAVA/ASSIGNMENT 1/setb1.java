import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class Date_format
{
      public static void main(String[] args)
      {
             Date date = new Date();
             SimpleDateFormat df = new  SimpleDateFormat("dd/mm/yy");
             System.out.println("\n Current date is : "+df.format(date));
             
             SimpleDateFormat ddf = new  SimpleDateFormat("MM-dd-yyyy");
             System.out.println("\n Current date is : "+ddf.format(date));
             
             
             SimpleDateFormat df1 = new  SimpleDateFormat("EEEEEE MMMM dd yyyy");
             System.out.println("\n Current date is : "+df1.format(date));
           
             SimpleDateFormat df2 = new  SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
             System.out.println("\n Current date and time is : "+df2.format(date));
          
             SimpleDateFormat df4 = new  SimpleDateFormat("dd/mm/yy HH:mm:ss a Z");
             System.out.println("\n Current date is : "+df4.format(date));
          
             SimpleDateFormat df5 = new  SimpleDateFormat("hh:mm:ss");
             System.out.println("\n Current time is : "+df5.format(date));
          
             SimpleDateFormat df6 = new  SimpleDateFormat("w");
             System.out.println("\n Current week of year  is : "+df6.format(date));
          
             SimpleDateFormat df7 = new  SimpleDateFormat("W");
             System.out.println("\n Current week of month  is : "+df7.format(date));
          
             SimpleDateFormat df8 = new  SimpleDateFormat("D");
             System.out.println("\n Current day of the year is : "+df8.format(date));
          
            
             
          
          
             
      }
}
