import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
class email
{
    String username,password;
    email()
    {
        username="siddhi";
        password="7385";
    }
    email(String user,String pass)
    {
        username=user;
        password=pass;
    }
    public static void main(String[] args) {
        String user,pass;
        int p=-1,u=-1;
        email obj=new email();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter username: ");
        user=sc.next();
        System.out.println("\nEnter password: ");
        pass=sc.next();
        email obj1=new email(user,pass);
        if((obj.username).equals(obj1.username))
        {
            u=1;
            if (obj.password.equals(obj1.password))        
                p=1;      
            else      
                p=0;    
        }
        else 
            u=0;  
        if(u==0)
            {
                try{
                        throw new NullPointerException();
                    }
                    catch (Exception e) {
                        System.out.println("exception in thread ‘main’ InvaliduserNameException: Username: "+ user+ " doesn’t match")  ;
                    }
                }
            if (p==0){        
                    try{
                        throw new NullPointerException();
                    }
                    catch (Exception e) {
                        System.out.println("exception in thread ‘main’ InvalidPasswordException: Password: "+ pass+ " doesn’t match")  ;
                    }
                }
}
}	

